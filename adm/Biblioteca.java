package adm;
import java.util.ArrayList;
import Item.*;

import Item.Livros;
public class Biblioteca {
    private static int data; //Atributo que guarda a data atual, ainda precisamos estudar como implementar
    private ArrayList<Item> estoque; // a ideia é que essa clase exista como um banco de dados dos livros disponíveis

    public Biblioteca(){
        this.data = 0; //
        this.estoque = new ArrayList<Item>();
    }

    public static int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ArrayList<Item> getEstoque(){
        return estoque;
    }
}
