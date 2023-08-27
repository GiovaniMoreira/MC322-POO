package adm;
import java.util.ArrayList;

import Item.Livros;
import membro.Usuario;

public class Emprestimo {
    private int dataEmprestimo;
    private int dataDevolucao;
    private Livros livro;
    private Usuario usuario;

    public Emprestimo(int data, Livros livro, Usuario usuario){
        this.dataEmprestimo = data;
        this.dataDevolucao = data+7;
        this.livro = livro;
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

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
