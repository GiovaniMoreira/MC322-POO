package biblioteca.models.adm;


public class Reservaitem extends Reserva{
    public Reservaitem(int idMembro, int idEmprestavel){
        super(idMembro, int idEmprestavel);
        this.idMembro = idMembro;
        this.idEmprestavel = idEmprestavel;
    }

}