package biblioteca.models.itens;

import biblioteca.models.adm.Reserva;

import java.util.ArrayList;

public class Livro extends Item{
    private int ISBN;
    private int edicao;
    private String conservacao;
    private String localizacao;
    private int nEmprestimos;
    private int nReservas;
    private boolean disponibilidade;
    private ArrayList<Reserva> reservas;
    public Livro(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int isbn, int edicao, String conservacao, String localizacao) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.ISBN = isbn;
        this.edicao = edicao;
        this.conservacao = conservacao;
        this.localizacao = localizacao;
        this.disponibilidade = true;
        ArrayList<Reserva> reservas = new ArrayList<Reserva>(1);
        this.reservas = reservas;
        this.nEmprestimos = 0;
        this.nReservas = 0;
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

    @Override
    public String toString(){
        String texto = "Título: " + titulo + "\n" +
                "Tombo: " + tombo + "\n" +
                "Autor: " + autor + "\n" +
                "Editora: " + editora + "\n" +
                "Genero: " + genero + "\n" +
                "Ano de publicação: " + anoPub + "\n" +
                "Sinopse: " + sinopse + "\n" +
                "Número de vezes que foi emprestado: " + nEmprestimos + "\n" +
                "Número de vezes que foi reservado: " + nReservas + "\n" +
                "Número de pessoas na fila de reserva: " + reservas.size() + "\n" +
                "Disponibilidade: " + disponibilidade + "\n" +
                "ISBN: " + ISBN + "\n" +
                "Edicao: " + edicao + "\n" +
                "Estado de conservacao: " + conservacao + "\n" +
                "Localizacao na biblioteca: " + localizacao + "\n";
        return texto;
    }
}