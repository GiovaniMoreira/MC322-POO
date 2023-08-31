package src.adm;

import src.Item.Item;

import java.util.ArrayList;

public class Lista {
    private String titulo;
    private ArrayList<Item>  lista;

    public Lista(String titulo){
        this.titulo = titulo;
        this.lista = new ArrayList<Item>();
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Item> getLista() {
        return lista;
    }
}
