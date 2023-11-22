package biblioteca.models.itens;

// Interface para métodos específicos de DVDs
public interface DVDInterface {
    int getDuracao();
    void setDuracao(int duracao);
    String getElenco();
    void setElenco(String elenco);
}

// Classe que implementa detalhes específicos de DVDs
public class DVD extends ItemMultimidiaImpl implements DVDInterface {
    private int duracao;
    private String elenco;

    public DVD(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int duracao, String elenco) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.duracao = duracao;
        this.elenco = elenco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }
}
