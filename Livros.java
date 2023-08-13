public class Livros {
    private int ISBM;
    private int tombo;
    private String titulo;
    private String autor;
    private int edicao;
    private String editora;

    public Livros(int isbm, int tombo, String titulo, String autor, int edicao, String editora) {
        ISBM = isbm;
        this.tombo = tombo;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
    }
}
