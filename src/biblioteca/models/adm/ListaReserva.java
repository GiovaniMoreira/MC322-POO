package biblioteca.models.adm;

import java.util.ArrayList;
import java.util.List;

public class ListaReserva<T extends Reserva> {
    private List<T> reservas;

    public ListaReserva() {
        List<T> reservas = new ArrayList<>();
        this.reservas = reservas;
    }

    public List<T> getList() {
        return reservas;
    }

    public void adicionarReserva(T reserva){
        reservas.add(reserva);
    }

    public void removerReserva(T reserva){
        reservas.remove(reserva);
    }
    
    public void removerReserva(int I){
        reservas.remove(I);
    }
}
