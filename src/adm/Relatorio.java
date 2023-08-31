package src.adm;
//pega os dados da biblioteca e junta tudo. n de emprestimos, livros e multas
import src.Item.Item;

import java.util.ArrayList;
import java.util.Iterator;


public class Relatorio {
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Lista> items;
    private int multas;

    public Relatorio(Biblioteca biblioteca) { //O emprestimo depende do momento biblioteca  e não existe sem ela
        this.emprestimos = biblioteca.getEmprestimos();
        this.items = biblioteca.getListas();
        this.multas = biblioteca.getMultas();
    }

    //Gerador de relatorio
    public void gerarRelatorio() {
        int numeroEmprestimos = emprestimos.size();
        int numeroLivros = items.size();

        System.out.println("Relatório da Biblioteca:");
        System.out.println("Número de Empréstimos: " + numeroEmprestimos);
        System.out.println("Número de Livros: " + numeroLivros);
        System.out.println("Número de Multas: " + multas);
    }
    public void gerarRelatóriItens(Biblioteca biblioteca){
        Iterator<Lista> iterator = biblioteca.getListas().iterator();
        while (iterator.hasNext()){
            Lista i = iterator.next();
            Iterator<Item> itLivro = i.getLista().iterator();
            int buffer1 = 0;
            int buffer2 = 0;
            while (itLivro.hasNext()){
                Item j = itLivro.next();
                buffer1 += j.getnEmprestimos();
                buffer2 += j.getnReservas();
            }
            System.out.println("Livro: " + i.getTitulo()+"\nEmprestimos: "+buffer1+"\nReservas: "+buffer2);
        }
    }
}


