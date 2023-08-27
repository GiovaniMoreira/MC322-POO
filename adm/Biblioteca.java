package adm;
import java.util.ArrayList;
import Item.*;

import Item.Livros;
import membro.Usuario;

public class Biblioteca {
    private static int data; //Atributo que guarda a data atual, ainda precisamos estudar como implementar
    private ArrayList<Item> estoque; // a ideia é que essa clase exista como um banco de dados dos livros disponíveis
    private ArrayList<Emprestimo> emprestimos;

    private int multas; //Essa multa representa apenas quantos usuarios estão multados no momento

    public Biblioteca(){
        this.data = 0; //essa data eventualmente substituida por um clock interno ou algo que perceba que tempo é
        this.estoque = new ArrayList<Item>();
        this.emprestimos = new ArrayList<Emprestimo>();
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
    public ArrayList<Emprestimo> getEmprestimos(){
        return emprestimos;
    }

    public int getMultas(){ return multas;}

    public void emprestar(Item item, Usuario usuario){
        usuario.getEmprestimos().add(new Emprestimo(item, usuario));
        this.emprestimos.add(new Emprestimo(item, usuario));
        this.estoque.remove(item);
    }

    public void renovar(Emprestimo emprestimo){
        new Renovacao(emprestimo);
    }

    public void devolver(Emprestimo emprestimo){
        data = this.getData();
        if (data > emprestimo.dataDevolucao){
            int multa = emprestimo.getUsuario().getMulta();
            emprestimo.getUsuario().setMulta(multa += (data- emprestimo.dataDevolucao)*3);
            multa +=1;
        }
        new Devolucao(emprestimo, data);
        emprestimo.getUsuario().getEmprestimos().remove(emprestimo);
        this.emprestimos.remove(emprestimo);
        emprestimo.getItem().guardar(this);
    }

}
