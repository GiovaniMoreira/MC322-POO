package membro;

import adm.Emprestimo;
import adm.*;
import Item.*;

import java.util.ArrayList;

public class Usuario extends Pessoa {
    private ArrayList<Emprestimo> emprestimos;
    protected int nivel;
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


}
