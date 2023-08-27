package adm;
import java.util.ArrayList;
import Item.*;

import Item.Livros;
import membro.Usuario;

public class Biblioteca {
    private static int data; //Atributo que guarda a data atual, ainda precisamos estudar como implementar
    private ArrayList<Item> estoque; // a ideia é que essa clase exista como um banco de dados dos livros disponíveis
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca(){
        this.data = 0; //essa data eventualmente substituida por um clock interno ou algo que perceba que tempo é
        this.estoque = new ArrayList<Item>();
        this. emprestimos = new ArrayList<Emprestimo>();
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

    public void emprestar(Item item, Usuario usuario){
        usuario.getEmprestimos().add(new Emprestimo(item, usuario));
        this.emprestimos.add(new Emprestimo(item, usuario));
    }
}
