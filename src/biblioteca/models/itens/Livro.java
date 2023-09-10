package biblioteca.models.itens;
public class Livro extends Item{
    private int ISBN;
    private int edicao;
    private String conservacao;
    private String localizacao;
    public Livro(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int isbn, int edicao, String conservacao, String localizacao) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        ISBN = isbn;
        this.edicao = edicao;
        this.conservacao = conservacao;
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}