package src.adm;import src.Item.*;import src.membro.*;

public class Emprestimo {
    protected int dataEmprestimo;
    protected int dataDevolucao;
    protected final Item item; //Para cada Emprestimo são associados um item e um usuário, porem o mesmo usuario pode ter varios emprestimos
    protected final Usuario usuario;

    //Construtor
    public Emprestimo(Item item, Usuario usuario) {
        this.dataEmprestimo = Biblioteca.getData();
        this.item = item;
        this.usuario = usuario;
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

    public Usuario getUsuario(){
        return usuario;
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
            double multa = this.usuario.getValorMulta();
            this.usuario.setValorMulta(multa + (data-dataDevolucao)*3);
            biblioteca.setMultas(biblioteca.getMultas()+1);
        }
        biblioteca.getEmprestimos().remove(0);
        usuario.getEmprestimos().remove(0);
    }

}
