package biblioteca.models.adm;

import java.util.ArrayList;

public class ListaEmprestimo<T extends Emprestimo> {
    private ArrayList<T> emprestimos;

    public ListaEmprestimo(){
        ArrayList<T> emprestimos = new ArrayList<>();
        this.emprestimos = emprestimos;
    }

    public void addEmprestimo(T emprestimo){
        emprestimos.add(emprestimo);
    }

    public ArrayList<T> getEmprestimos() {
        return emprestimos;
    }

    public int size(){return emprestimos.size();}

    public void remove(T emprestimo) {
        emprestimos.remove(emprestimos);
    }
}