package biblioteca.models.adm;

public class Reserva {
    private int idMembro;
    private int idEmprestavel;
    private int data;

    public Reserva(int idMembro, int idEmprestavel, int data) {
        this.idMembro = idMembro;
        this.idEmprestavel = idEmprestavel;
        this.data = data;
    }

    public int getIdMembro() {
        return idMembro;
    }

    public int getIdEmprestavel() {
        return idEmprestavel;
    }

    public int getData() {
        return data;
    }
}
