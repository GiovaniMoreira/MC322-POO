package biblioteca.models.adm;

public class Reserva {
    private int idMembro;
    private int idEmprestavel;

    public Reserva(int idMembro, int idEmprestavel) {
        this.idMembro = idMembro;
        this.idEmprestavel = idEmprestavel;
    }

    public int getIdMembro() {
        return idMembro;
    }

    public int getIdEmprestavel() {
        return idEmprestavel;
    }
}
