package biblioteca.models.itens;

import biblioteca.models.adm.Reserva;

import java.util.ArrayList;

// Interface para métodos específicos de livros
public interface LivroInterface {
    String getFormato();
    void setFormato(String formato);
    String getLink();
    void setLink(String link);
    String getReqLeitura();
    void setReqLeitura(String reqLeitura);
}

public class Livro extends ItemMultimidiaImpl implements LivroInterface {
    private formatoLivro formato;
    private String link;
    private String reqLeitura;
    private int ISBN;
    private int edicao;
    private String conservacao;
    private String localizacao;
    private List<Reserva> reservas;

    //Construtor
    public Livro(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse,
    formatoLivro formato, String link, String reqLeitura, int ISBN, int edicao, String conservacao, String localizacao) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.formato = formato;
        this.link = link;
        this.reqLeitura = reqLeitura;
        this.ISBN = isbn;
        this.edicao = edicao;
        this.conservacao = conservacao;
        this.localizacao = localizacao;
        ArrayList<Reserva> reservas = new ArrayList<Reserva>(1);
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
        String texto = "Título: " + this.titulo + "\n" +
                "Tombo: " + this.tombo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Editora: " + this.editora + "\n" +
                "Genero: " + this.genero + "\n" +
                "Ano de publicação: " + this.anoPub + "\n" +
                "Sinopse: " + this.sinopse + "\n" +
                "Número de vezes que foi emprestado: " + this.nEmprestimos + "\n" +
                "Número de vezes que foi reservado: " + this.nReservas + "\n" +
                "Número de pessoas na fila de reserva: " + this.reservas.size() + "\n" +
                "Disponibilidade: " + this.disponibilidade + "\n" +
                "ISBN: " + this.ISBN + "\n" +
                "Edicao: " + this.edicao + "\n" +
                "Estado de conservacao: " + this.conservacao + "\n" +
                "Localizacao na biblioteca: " + this.localizacao + "\n";
        return texto;
    }
}

