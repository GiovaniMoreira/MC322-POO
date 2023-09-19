package biblioteca.controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import biblioteca.models.adm.Emprestimo;
import biblioteca.models.adm.Reserva;
import biblioteca.models.itens.Emprestavel;
import biblioteca.models.membro.Membro;

public class BibliotecaControllerImpl implements BibliotecaController {
    private HashMap<Integer, Emprestavel> estoque;
    private HashSet<Emprestimo> emprestimos;
    private static int idEmprestimo;

    public BibliotecaControllerImpl() {
        HashMap<Integer, Emprestavel> estoque = new HashMap<Integer, Emprestavel>();
        this.estoque = estoque;
        HashSet<Emprestimo> emprestimos = new HashSet<>();
        this.emprestimos = emprestimos;
        this.idEmprestimo = 0;
    }

    @Override
    public Map consultarItensDisponiveis() {
        return estoque;
    }

    @Override
    public boolean emprestarItem(Membro membro, Emprestavel item, int data) {
        if (membro.getEmprestimos().size() >= membro.getLimiteEmprestimos()) {
            System.out.println(membro.getEmprestimos().size());
            System.out.println(membro.getLimiteEmprestimos());
            System.out.println("Numero máximo de emprestimos ja feito");
            return false;
        }
        if (item.getDisponibilidade() == false) {
            if (item.getReserva().isEmpty()) { //Livro emprestado mas não reservado
                System.out.println("Item ja emprestado");
                item.reserva(membro.getRa());
                System.out.println("Usuário adicionado à lista de espera");
                return false;
            } else if (item.getReserva().get(0).getIdMembro() == membro.getRa()) { //Livro não emprestado reservado pela pessoa que está tentando emprestar
                Emprestimo emprestimo = new Emprestimo(membro, item, data, idEmprestimo);
                idEmprestimo += 1;
                membro.getEmprestimos().add(emprestimo);
                emprestimos.add(emprestimo);
                item.setnEmprestimos(item.getnEmprestimos() + 1);
                item.setDisponibilidade(false);
                item.getReserva().remove(0);
                System.out.println("Item emprestado com sucesso");
                System.out.println("Id do empréstimo:" +emprestimo.getIdEmprestimo());
                return true;
            } else { //Livro emprestrado ou não, mas reservado por alguem que não é a pessoa que está tentando emprestar no momento
                System.out.println("Item ja reservado");
                item.reserva(membro.getRa());
                System.out.println("Usuário adicionado à lista de espera");
                return false;
            }
        } else { //Livro não emprestado e não reservado
            Emprestimo emprestimo = new Emprestimo(membro, item, data, idEmprestimo);
            membro.getEmprestimos().add(emprestimo);
            emprestimos.add(emprestimo);
            idEmprestimo += 1;
            item.setnEmprestimos(item.getnEmprestimos() + 1);
            item.setDisponibilidade(false);
            System.out.println("Item emprestado com sucesso");
            System.out.println("Id do empréstimo:" +emprestimo.getIdEmprestimo());
            return true;
        }
    }

    @Override
    public boolean devolverItem(Membro membro, Emprestavel item, int data, int idEmprestimo) {
        if (item.getReserva().isEmpty()) {
            item.setDisponibilidade(true);
        }
        for(Emprestimo emprestimo : membro.getEmprestimos()){
            if (emprestimo.getIdEmprestimo() == idEmprestimo){
                membro.getEmprestimos().remove(emprestimo);
            }
        }
        for(Emprestimo emprestimo:emprestimos){
            if (emprestimo.getIdEmprestimo() == idEmprestimo){
                emprestimos.remove(emprestimo);
            }
        }
        System.out.println("Livro devolvido com sucesso");
        return true;
    }

    @Override
    public Emprestavel buscaItemPorId(int Id) {
        if (estoque.containsKey(Id)){
            return estoque.get(Id);
        }
        return null;
    }


    public void adicionarItem(int Id, Emprestavel item){
        this.estoque.put(Id,item);
    }
}