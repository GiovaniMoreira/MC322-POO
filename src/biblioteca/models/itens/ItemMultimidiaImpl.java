package biblioteca.models.itens;

import biblioteca.models.adm.Reserva;

import java.util.ArrayList;

public abstract class ItemMultimidiaImpl implements ItemMultimidia {
    //Atributos genéricos
    protected int tombo;
    protected String titulo;
    protected String autor;
    protected String editora;
    protected String genero;
    protected int anoPub;
    protected String sinopse;
    protected int nEmprestimos ;
    protected int nReservas;
    protected ArrayList<Reserva> reservas;
    protected boolean disponibilidade;
    //Construtor
    public ItemMultimidiaImpl(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse){
        this.tombo = tombo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.anoPub = anoPub;
        this.sinopse = sinopse;
        this.disponibilidade = true;
        ArrayList<Reserva> reservas = new ArrayList<Reserva>(1);
        this.reservas = reservas;
        this.nEmprestimos = 0;
        this.nReservas = 0;
    }
    //Getters e Setters
    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getAutor() {
        return autor;
    }

    public int getAnoPub(){
        return anoPub;
    }
    public void setAnoPub(int anoPub){
        this.anoPub = anoPub;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getnEmprestimos() {
        return nEmprestimos;
    }

    public void setnEmprestimos(int nEmprestimos) {
        this.nEmprestimos = nEmprestimos;
    }

    public int getnReservas() {
        return nReservas;
    }

    public void setnReservas(int nReservas) {
        this.nReservas = nReservas;
    }
    //metodos

    public ArrayList<Reserva> getReserva() {
        return reservas;
    }

    public void setReserva(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
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
                "Disponibilidade: " + disponibilidade + "\n";
        return texto;
    }
}