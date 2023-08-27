package adm;

public class Devolucao {
    private Emprestimo emprestimo;
    private int data;

    public Devolucao(Emprestimo emprestimo, int data){
        this.emprestimo = emprestimo;
        this.data = data;
    }


    //getters e setters
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    //devolver
}
