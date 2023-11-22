package biblioteca.models.itens;

// Interface para métodos específicos de CDs
public interface CDInterface {
    int getDuracao();
    void setDuracao(int duracao);
    String getListaFaixas();
    void setListaFaixas(String listaFaixas);
}

// Classe que implementa detalhes específicos de CDs
public class CD extends ItemMultimidiaImpl implements CDInterface {
    private int duracao;
    private String listaFaixas;

    public CD(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int duracao, String listaFaixas) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.duracao = duracao;
        this.listaFaixas = listaFaixas;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public String getListaFaixas() {
        return listaFaixas;
    }

    public void setListaFaixas(String listaFaixas) {
        this.listaFaixas = listaFaixas;
    }
}
