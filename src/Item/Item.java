package src.Item;

import src.adm.Biblioteca;

public abstract class Item {
    protected int tombo;
    protected String titulo;
    protected String autor;
    protected String editora;
    protected String genero;
    protected int anoPub; //em livros sera usado como fisico/digital, em midias para cd/dvd
    protected String sinopse;

    public Item(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse){
        this.tombo = tombo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.anoPub = anoPub;
        this.sinopse = sinopse;
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

    //metodos
    public void guardar(Biblioteca biblioteca){
        biblioteca.getEstoque().add(this);
    }
}

