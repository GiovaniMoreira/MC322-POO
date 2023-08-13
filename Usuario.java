import java.util.Collections;
import java.util.ArrayList;

public class Usuario {
    private int ra;
    private String nome;
    private ArrayList<Emprestimo> emprestimos;

    public Usuario(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
        ArrayList<Emprestimo> myList = new ArrayList<Emprestimo>();
        this.emprestimos =  myList;

    }
}
