package adm;//pega os dados da biblioteca e junta tudo. n de emprestimos, livros e multas

import Item.*;
import adm.Emprestimo;
import java.util.ArrayList;


public class Relatorio {
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Item> items;
    private int multas;

    public Relatorio(Biblioteca biblioteca) {
        this.emprestimos = biblioteca.getEmprestimos();
        this.items = biblioteca.getEstoque();
        this.multas = biblioteca.getMultas();
    }

    public void gerarRelatorio() {
        int numeroEmprestimos = emprestimos.size();
        int numeroLivros = items.size();

        System.out.println("Relatório da Biblioteca:");
        System.out.println("Número de Empréstimos: " + numeroEmprestimos);
        System.out.println("Número de Livros: " + numeroLivros);
        System.out.println("Número de Multas: " + multas);
    }
}


