package src.adm;import src.Item.*;import src.membro.*;

import java.util.Iterator;

public class Emprestimo {
    protected int dataEmprestimo;
    protected int dataDevolucao;
    protected final Item item; //Para cada Emprestimo são associados um item e um usuário, porem o mesmo usuario pode ter varios emprestimos
    protected final Pessoa pessoa;
    protected final Biblioteca biblioteca;

    //Construtor
    public Emprestimo(Item item, Pessoa pessoa, Biblioteca biblioteca) {
        this.dataEmprestimo = Biblioteca.getData();
        this.item = item;
        this.pessoa = pessoa;
        this.biblioteca = biblioteca;
    }

    //Getters e Setters
    public int getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Pessoa getPessoa(){
        return pessoa;
    }

    public Item getItem(){
        return item;
    }

    //Funções
    public void empresta(){
        pessoa.getEmprestimos().add(this);
        biblioteca.getEmprestimos().add(this);
        System.out.println(item.getTitulo()+" emprestado por "+pessoa.getNome());
        item.setnEmprestimos(item.getnEmprestimos()+1);
        Iterator<Lista> listaIterator = biblioteca.getListas().iterator();
        while (listaIterator.hasNext()){
             Lista lista = listaIterator.next();
             if (lista.getTitulo() == item.getTitulo()){
                 
             }
        }
    }
    public void devolver(Biblioteca biblioteca){
        int data = biblioteca.getData();
        if (data > this.dataDevolucao){
            double multa = this.pessoa.getValorMulta();
            this.pessoa.setValorMulta(multa + (data-dataDevolucao)*3);
            biblioteca.setMultas(biblioteca.getMultas()+1);
        }
        biblioteca.getEmprestimos().remove(0);
        pessoa.getEmprestimos().remove(0);
    }

}
