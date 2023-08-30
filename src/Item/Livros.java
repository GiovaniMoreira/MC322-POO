package src.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Livros extends Item {
    private int ISBN;
    private int edicao;
    protected static ArrayList<Integer> totalEdicao;
    protected static ArrayList<Integer> disponivelEdicao;
    private String conservacao;
    private String localizaçao;

    //Construtor
    public Livros(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int ISBN, int edicao, ArrayList<Integer> totalEdicao, String conservacao, String localizaçao) {
        super(tombo,titulo,autor,editora,genero,anoPub,sinopse);
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.totalEdicao = totalEdicao;
        this.disponivelEdicao = totalEdicao;
        this.conservacao = conservacao;
        this.localizaçao = localizaçao;
    }
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
    public static ArrayList<Integer> getTotalEdicao() {
        return totalEdicao;
    }
    public static void setTotalEdicao(ArrayList<Integer> totalEdicao) {
        Livros.totalEdicao = totalEdicao;
    }
    public static ArrayList<Integer> getDisponivelEdicao() {
        return disponivelEdicao;
    }
    public static void setDisponivelEdicao(ArrayList<Integer> disponivelEdicao) {
        Livros.disponivelEdicao = disponivelEdicao;
    }
}
