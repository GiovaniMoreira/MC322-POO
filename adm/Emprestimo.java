package adm;import Item.*;import membro.*;
import java.util.ArrayList;

public class Emprestimo {
    protected int dataEmprestimo;
    protected int dataDevolucao;
    protected final Item item;
    protected final Usuario usuario;

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
}
