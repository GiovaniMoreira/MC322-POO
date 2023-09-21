package biblioteca.models.adm;

public class ListaReserva<T> {
    private List<T extends Reserva> reservas;

    public ListaReserva() {
        List<T extends Reserva> reservas = new List<>();
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
