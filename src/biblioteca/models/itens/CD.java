package biblioteca.models.itens;

import java.util.List;

public class CD extends ItemMultimidiaImpl{
    public CD(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse,int duracao, String listaFaixas) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.duracao = duracao;
        this.listaFaixas = listaFaixas;
    }
    private int duracao;
    private String listaFaixas;

    public int getDuracao(){return duracao;}
    public void setDuracao(int duracao){this.duracao = duracao;}
    public String getListaFaixas(){return listaFaixas;}
    public void setListaFaixas(String listaFaixas){this.listaFaixas = listaFaixas;}
}
