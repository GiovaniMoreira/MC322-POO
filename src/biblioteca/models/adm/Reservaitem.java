package biblioteca.models.adm;

public interface Reservavel {
    int getIdEmprestavel();
    int getDataReserva();
}

public class Reservaitem extends Reserva implements Reservavel {
    public Reservaitem(int idMembro, int idEmprestavel, int data){
        super(idMembro, idEmprestavel, data);
    }
}
