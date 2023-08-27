package membro;

import adm.Emprestimo;

import java.util.ArrayList;

public class Usuario extends Pessoa {
    private ArrayList<Emprestimo> emprestimos;
    private int nivel;
    public Usuario(String nome, int ra) {
        super(nome, ra);
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    public int getNivel(){return nivel;}

    public void emprestar(Item )
}
