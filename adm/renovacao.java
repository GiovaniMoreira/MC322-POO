package adm;

public class renovacao {
    protected Emprestimo emprestimo;
    public renovacao(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
        emprestimo.setDataDevolucao(emprestimo.getDataDevolucao()+7);
    }
}
