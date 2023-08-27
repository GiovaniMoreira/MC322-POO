package adm;import Item.*;import membro.*;
import java.util.ArrayList;

public class Emprestimo {
    protected int dataEmprestimo;
    protected int dataDevolucao;
    protected Item item;
    protected Usuario usuario;

    public Emprestimo(Item item, Usuario usuario){
        this.dataEmprestimo = Biblioteca.getData();
        if (usuario.getNivel()==2){
            this.dataDevolucao = dataEmprestimo +14;
        } else {
            this.dataDevolucao = dataEmprestimo +7;
        }
        this.item = item;
        this.usuario = usuario;
    }

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


}
