package membro;
import java.util.Collections;

import adm.Emprestimo;

import java.util.ArrayList;

public class Usuario {
    private int ra;
    private String nome;
    private ArrayList<Emprestimo> emprestimos;

    public Usuario(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.emprestimos =  new ArrayList<Emprestimo>();;

    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
