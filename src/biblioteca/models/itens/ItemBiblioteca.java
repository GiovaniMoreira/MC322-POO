package biblioteca.models.itens;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ItemBiblioteca<T extends ItemMultimidia> {
    private T item;
    private static ListaEmprestimos<T> itensEmprestados;
    private static ListaReservas<> itensReservados;
    private static int nItensEmprestados = itensEmprestados.size();
    private static int nItensReservados = itensReservados.size();

    public ItemBiblioteca(T item){
        this.item = item;
    }


    public static int getnItensReservados() {
        return nItensReservados;
    }

    public static int getnItensEmprestados() {
        return nItensEmprestados;
    }

    public static Collection getItensEmprestados(){
        return itensEmprestados.values();
    }
    public static Collection getItensReservados(){
        return itensReservados.values();
    }
    public void emprestar(int idItem, int idMembro){}
    public void reservar(int idItem, int idMembro){}
    public void devolver(int idItem, int idMembro){}
}
