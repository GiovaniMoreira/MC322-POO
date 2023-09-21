package biblioteca.models.itens;

import biblioteca.models.adm.Reserva;

import java.util.ArrayList;

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
    public enum formatoEbook{
        epub, pdf, mobi
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
                "Formato do Ebook: " + formato.toString() + "\n" +
                "Link de acesso: " + link + "\n" +
                "Requisitos de leitura: " + reqLeitura + "\n";
        return texto;
    }
}

