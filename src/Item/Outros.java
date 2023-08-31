package src.Item;

public class Outros extends Item{
    private String tipoRecurso;
    private String formato;
    private String localizacao;
    private String conservacao;

    public Outros(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, String tipoRecurso, String formato, String localizacao, String conservacao) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.tipoRecurso = tipoRecurso;
        this.formato = formato;
        this.localizacao = localizacao;
        this.conservacao = conservacao;
    }
}
