package src.Item;


public class Livros extends Item {
    protected int ISBM;
    protected int edicao;
    protected String editora;

    public Livros(int tombo, String titulo, String autor, boolean disponibilidade, int isbm, int edicao, String editora, String idioma, String genero, String formato) {
        super(tombo, titulo, autor, disponibilidade, idioma, genero, formato);
        this.ISBM = isbm;
        this.edicao = edicao;
        this.editora = editora;
    }

    public int getISBM() {
        return ISBM;
    }

    public void setISBM(int ISBM) {
        this.ISBM = ISBM;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
