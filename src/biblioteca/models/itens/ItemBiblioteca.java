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

        // Exceção para quando o limite de empréstimos de um membro for excedido
    class LimiteEmprestimosExcedidoException extends Exception {
        public LimiteEmprestimosExcedidoException(String message) {
            super(message);
        }
    }

    // Exceção para quando um item já estiver emprestado
    class ItemJaEmprestadoException extends Exception {
        public ItemJaEmprestadoException(String message) {
            super(message);
        }
    }

    // Exceção para quando um item já estiver reservado
    class ItemJaReservadoException extends Exception {
        public ItemJaReservadoException(String message) {
            super(message);
        }
    }

    class ItemNaoEmprestadoException extends Exception {
        public ItemNaoEmprestadoException(String message) {
            super(message);
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
       try{
            if (membro.getEmprestimos().size() >= membro.getLimiteEmprestimos()) {
                throw new LimiteEmprestimoExcedidoException("Numero máximo de emprestimos ja feito");
            }
            if (item.getDisponibilidade() == false) {
                if (item.getReserva().isEmpty()) { //Livro emprestado mas não reservado => Coloca usuario na lista de espera
                    throw new ItemJaEmprestadoException("Item ja emprestado");
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
                    throw new ItemJaReservadoException("Item ja reservado");
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
        } catch (LimiteEmprestimoExcedidoException | ItemJaEmprestadoException | ItemJaReservadoException e){
            System.err.println("Erro: " e.getMessage());
            return false;
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
        try{
            booleam itemEmprestadoParaMembro = false;
            for (Emprestimo emprestimo : membro.getEmprestimos().getEmprestimos()){
                If(emprestimo.getIdEmprestimo() == idEmprestimo){
                    membro.getEmprestimos().remove(emprestimo);
                    itemEmprestadoParaMembro = true;
                    break;
                }
            }

            If (!itemEmprestadoParaMembro){
                throw new ItemNaoEmprestadoException("Este item não foi emprestado para este membro")
            }

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
        
        } catch (ItemNaoEmprestadoException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
