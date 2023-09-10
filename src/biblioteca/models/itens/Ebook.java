package biblioteca.models.itens;

public class Ebook extends Item{
    private formatoEbook formato;
    private String link;
    private String reqLeitura;

    //Construtor
    public Ebook(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, formatoEbook formato, String link, String reqLeitura) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.formato = formato;
        this.link = link;
        this.reqLeitura=reqLeitura;
    }

    //Getters e setters
    public String getFormato() {
        return formato.toString();
    }

    public void setFormato(String formato) {
        this.formato = formatoEbook.valueOf(formato);
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
    private enum formatoEbook{
        epub, pdf, mobi
    }
}

