package src.Item;

import java.util.ArrayList;

public class CD extends Item{
    private ArrayList<String> listaFaixas;
    private int duracao;
    private String conservacao;

    public CD(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int totalCopias, ArrayList<String> listaFaixas, int duracao, String conservacao) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.listaFaixas = listaFaixas;
        this.duracao = duracao;
        this.conservacao = conservacao;
    }

    public ArrayList<String> getListaFaixas() {
        return listaFaixas;
    }

    public void setListaFaixas(ArrayList<String> listaFaixas) {
        this.listaFaixas = listaFaixas;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }
}
