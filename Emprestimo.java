import java.util.ArrayList;

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
}
