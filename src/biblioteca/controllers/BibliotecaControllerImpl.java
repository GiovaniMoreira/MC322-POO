package biblioteca.controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import biblioteca.models.adm.Emprestimo;
import biblioteca.models.itens.Emprestavel;
import biblioteca.models.membro.Membro;

public class BibliotecaControllerImpl implements BibliotecaController {
    private HashMap<Integer, Emprestavel> estoque;
    private HashSet<Emprestimo> emprestimos;

    public BibliotecaControllerImpl() {
        Map<Integer, Emprestavel> estoque = new HashMap<>();
        Set<Emprestimo> emprestimos = new HashSet<>();
    }

    @Override
    public Map consultarItensDisponiveis() {
        return estoque;
    }

    @Override
    public boolean emprestarItem(Membro membro, Emprestavel item, int data) {
        if (membro.getEmprestimos().size() >= membro.getLimiteEmprestimo()) {
            System.out.println("Numero máximo de emprestimos ja feito");
            return false;
        }
        if (item.getDisponibilidade() == false) {
            if (item.getReserva() == membro.getRa()) {
                Emprestimo emprestimo = new Emprestimo(membro, item, data);
                membro.getEmprestimos().add(emprestimo);
                emprestimos.add(emprestimo);
                item.setnEmprestimos(item.getnEmprestimos() + 1);
                item.setDisponibilidade(false);
                return true;
            } else {
                System.out.println("Livro ja emprestado/reservado");
                return false;
            }
        } else {
            Emprestimo emprestimo = new Emprestimo(membro, item, data);
            membro.getEmprestimos().add(emprestimo);
            emprestimos.add(emprestimo);
            item.setnEmprestimos(item.getnEmprestimos() + 1);
            item.setDisponibilidade(false);
            return true;
        }
    }

    @Override
    public boolean devolverItem(Membro membro, Emprestavel item, int data) {
        return false;
    }

    @Override
    public Emprestavel buscaItemPorId(int Id) {
        if (estoque.containsKey(Id)){
            return estoque.get(Id);
        }
        return null;
    }
}