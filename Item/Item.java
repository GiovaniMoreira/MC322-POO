package Item;

import adm.Biblioteca;

public abstract class Item {
    protected int tombo;
    protected String titulo;
    protected String autor;
    protected boolean disponibilidade;
    protected String idioma;
    protected String genero;
    protected String formato; //em livros sera usado como fisico/digital, em midias para cd/dvd

    public Item(int tombo, String titulo, String autor, boolean disponibilidade, String idioma, String genero, String formato) {
        this.tombo = tombo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = disponibilidade;
        this.idioma = idioma;
        this.genero = genero;
        this.formato = formato;
    }


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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    //metodos
    public void guardar(Biblioteca biblioteca){
        biblioteca.getEstoque().add(this);
    }
}

