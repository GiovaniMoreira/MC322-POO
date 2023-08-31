package src.Item;

import java.util.ArrayList;

public class DVD extends Item{
    private ArrayList<String> Elenco;
    private int duracao;
    private String conservacao;

    public DVD(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, ArrayList<String> Elenco, int duracao, String conservacao) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.Elenco = Elenco;
        this.duracao = duracao;
        this.conservacao = conservacao;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<String> getElenco() {
        return Elenco;
    }

    public void setElenco(ArrayList<String> elenco) {
        this.Elenco = elenco;
    }
}
