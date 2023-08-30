package src.Item;

public class Livro extends Item {
    private int ISBN;
    private int edicao;
    private String conservacao;
    private String localizaçao;

    public Livro(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int totalCopias, int ISBN, int edicao, String localizaçao, String conservacao) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse, totalCopias);
        this.ISBN =ISBN;
        this.edicao = edicao;
        this.conservacao = conservacao;
        this.localizaçao = localizaçao;
    }


    //Construtor

    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public String getConservacao() {
        return conservacao;
    }
    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }
    public String getLocalizaçao() {
        return localizaçao;
    }
    public void setLocalizaçao(String localizaçao) {
        this.localizaçao = localizaçao;
    }

}
