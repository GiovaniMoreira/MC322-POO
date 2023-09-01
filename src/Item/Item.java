package src.Item;

import src.adm.Biblioteca;
import src.membro.Pessoa;

public abstract class Item {
    protected int tombo;
    protected String titulo;
    protected String autor;
    protected String editora;
    protected String genero;
    protected int anoPub; //em livros sera usado como fisico/digital, em midias para cd/dvd
    protected String sinopse;
    private int nEmprestimos = 0;
    private int nReservas = 0;
    private Pessoa reserva = null;
    private boolean disponibilidade;
    public Item(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse){
        this.tombo = tombo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.anoPub = anoPub;
        this.sinopse = sinopse;
        this.disponibilidade = true;
    }

    //Getters e setters
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

    public Pessoa getReserva() {
        return reserva;
    }

    public void setReserva(Pessoa reserva) {
        this.reserva = reserva;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }
}

