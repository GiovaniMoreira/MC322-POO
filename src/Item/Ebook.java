package src.Item;

public class Ebook extends Item{
    private String formato;
    private String link;
    private String reqLeitura;

    //Construtor
    public Ebook(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int totalCopias, String formato,String link, String reqLeitura) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse, totalCopias);
        this.formato = formato;
        this.link = link;
        this.reqLeitura=reqLeitura;
    }


    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getReqLeitura() {
        return reqLeitura;
    }

    public void setReqLeitura(String reqLeitura) {
        this.reqLeitura = reqLeitura;
    }
}
