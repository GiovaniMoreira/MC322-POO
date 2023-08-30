package src.adm;

public class Renovacao {
    protected Emprestimo emprestimo;
    public Renovacao(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
        emprestimo.setDataDevolucao(emprestimo.getDataDevolucao()+7);
    }
}
