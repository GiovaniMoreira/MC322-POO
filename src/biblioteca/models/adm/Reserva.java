package biblioteca.models.adm;

public interface Reservavel {
    int getIdEmprestavel();
    int getDataReserva();
}

public class Reserva {
    private int idMembro;
    private Reservavel reservavel;
    private int data;

    public Reserva(int idMembro, Reservavel reservavel, int data) {
        this.idMembro = idMembro;
        this.reservavel = reservavel;
        this.data = data;
    }

    public int getIdMembro() {
        return idMembro;
    }

    public Reservavel getReservavel() {
        return reservavel;
    }

    public int getData() {
        return data;
    }
}
