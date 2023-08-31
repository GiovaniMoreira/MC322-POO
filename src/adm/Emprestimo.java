package src.adm;import src.Item.*;import src.membro.*;

public class Emprestimo {
    protected int dataEmprestimo;
    protected int dataDevolucao;
    protected final Item item; //Para cada Emprestimo são associados um item e um usuário, porem o mesmo usuario pode ter varios emprestimos
    protected final Pessoa pessoa;

    //Construtor
    public Emprestimo(Item item, Pessoa pessoa) {
        this.dataEmprestimo = Biblioteca.getData();
        this.item = item;
        this.pessoa = pessoa;
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
    public void renovar(){
        new Renovacao(this);
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
