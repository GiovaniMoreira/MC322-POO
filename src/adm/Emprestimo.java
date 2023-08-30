package src.adm;import src.Item.*;import src.membro.*;

public class Emprestimo {
    protected int dataEmprestimo;
    protected int dataDevolucao;
    protected final Item item; //Para cada Emprestimo são associados um item e um usuário, porem o mesmo usuario pode ter varios emprestimos
    protected final Usuario usuario;

    //Construtor
    public Emprestimo(Item item, Usuario usuario) {
        this.dataEmprestimo = Biblioteca.getData();
        if (usuario.getNivel() == 3) {
            this.dataDevolucao = dataEmprestimo +21;
        } else if (usuario.getNivel() ==2) {
            this.dataDevolucao = dataDevolucao +14;
        }else {
            this.dataDevolucao = dataEmprestimo +7;
        }
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
            int multa = this.usuario.getMulta();
            this.usuario.setMulta(multa + (data-dataDevolucao)*3);
            biblioteca.setMultas(biblioteca.getMultas()+1);
        }
        biblioteca.getEmprestimos().remove(0);
        usuario.getEmprestimos().remove(0);
        item.guardar(biblioteca);
    }

}
