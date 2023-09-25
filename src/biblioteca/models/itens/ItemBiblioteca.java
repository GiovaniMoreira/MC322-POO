package biblioteca.models.itens;

import biblioteca.controllers.BibliotecaController;
import biblioteca.models.adm.Emprestimo;
import biblioteca.models.adm.Reserva;
import biblioteca.models.membro.Membro;

import java.util.ArrayList;

public class ItemBiblioteca<T extends ItemMultimidia> {
    private T item;
    private static ArrayList<Emprestimo> itensEmprestados;
    private static ArrayList<Reserva> itensReservados;
    private static int emprestimoAtual;

    public ItemBiblioteca(T item){
        this.item = item;
        if (itensEmprestados == null){
            this.itensEmprestados = new ArrayList<>();
        }
        if (itensReservados == null){
            this.itensReservados = new ArrayList<>();
        }
    }


    public static int getnItensReservados() {
        return itensReservados.size();
    }

    public static int getnItensEmprestados() {
        return itensEmprestados.size();
    }

    public static ArrayList<Emprestimo> getItensEmprestados(){
        return itensEmprestados;
    }
    public static ArrayList getItensReservados(){
        return itensReservados;
    }
    public void setItem(T item){this.item = item;}
    public T getItem(){return item;}
    public boolean emprestar(Membro membro, int data, BibliotecaController controller){
        if (membro.getEmprestimos().size() >= membro.getLimiteEmprestimos()) {
            System.out.println("Numero máximo de emprestimos ja feito");
            return false;
        }
        if (item.getDisponibilidade() == false) {
            if (item.getReserva().isEmpty()) { //Livro emprestado mas não reservado => Coloca usuario na lista de espera
                System.out.println("Item ja emprestado");
                reservar(membro.getRa(), data, controller);
                System.out.println("Usuário adicionado à lista de espera");
                controller.consultarItensDisponiveis().put(item.getTombo(),item);
                return false;
            } else if (item.getReserva().get(0).getIdMembro() == membro.getRa()) { //Livro não emprestado reservado pela pessoa que está tentando emprestar => Empresta o livro e retira a pessoa da lista de espera
                Emprestimo emprestimo = new Emprestimo(membro, item, data, emprestimoAtual);
                emprestimoAtual += 1;
                membro.getEmprestimos().addEmprestimo(emprestimo);
                controller.consultarEmprestimos().addEmprestimo(emprestimo);
                item.setnEmprestimos(item.getnEmprestimos() + 1);
                item.setDisponibilidade(false);
                item.getReserva().remove(0);
                System.out.println("Item emprestado com sucesso");
                System.out.println("Id do empréstimo:" +emprestimo.getIdEmprestimo());
                controller.consultarItensDisponiveis().put(item.getTombo(),item);
                return true;
            } else { //Livro emprestrado ou não, mas reservado por alguem que não é a pessoa que está tentando emprestar no momento => Entra na lista de espera
                System.out.println("Item ja reservado");
                reservar(membro.getRa(), data, controller);
                System.out.println("Usuário adicionado à lista de espera");
                controller.consultarItensDisponiveis().put(item.getTombo(),item);
                return false;
            }
        } else { //Livro não emprestado e não reservado => Empresta o livro
            Emprestimo emprestimo = new Emprestimo(membro, item, data, emprestimoAtual);
            emprestimoAtual += 1;
            membro.getEmprestimos().addEmprestimo(emprestimo);
            controller.consultarEmprestimos().addEmprestimo(emprestimo);
            itensEmprestados.add(emprestimo);
            item.setnEmprestimos(item.getnEmprestimos() + 1);
            item.setDisponibilidade(false);
            item.getReserva().remove(0);
            System.out.println("Item emprestado com sucesso");
            System.out.println("Id do empréstimo:" + emprestimo.getIdEmprestimo());
            controller.consultarItensDisponiveis().put(item.getTombo(),item);
            return true;
        }
    }
    public void reservar(int idMembro, int data, BibliotecaController controller){
        Reserva reserva = new Reserva( idMembro, item.getTombo(), data);
        this.itensReservados.add(reserva);
        controller.consultarReserva().adicionarReserva(reserva);
        item.setnReservas(item.getnReservas()+1);
        item.setDisponibilidade (false);
        System.out.println("Item reservado com sucesso");
    }
    public void devolver( Membro membro, int data, int idEmprestimo, BibliotecaController controller){
        if (item.getReserva().isEmpty()) {
            item.setDisponibilidade(true);
        }
        for(Emprestimo emprestimo : membro.getEmprestimos().getEmprestimos()){
            if (emprestimo.getIdEmprestimo() == idEmprestimo){
                membro.getEmprestimos().remove(emprestimo);
            }
        }
        for(Emprestimo emprestimo:itensEmprestados){
            if (emprestimo.getIdEmprestimo() == idEmprestimo){
                membro.getEmprestimos().remove(emprestimo);
            }
        }
        for(Emprestimo emprestimo: controller.consultarEmprestimos().getEmprestimos()){
            if (emprestimo.getIdEmprestimo() == idEmprestimo){
                membro.getEmprestimos().remove(emprestimo);
            }
        }
        System.out.println("Livro devolvido com sucesso");
    }
}
