package Item;

//dvd e cd
public class midias extends Item {
    protected String distribuidora;

    public midias(int tombo, String titulo, String autor, boolean disponibilidade, String idioma, String genero, String distribuidora, String formato) {
        super(tombo, titulo, autor, disponibilidade, idioma, genero, formato);
        this.distribuidora = distribuidora;

    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }


}
