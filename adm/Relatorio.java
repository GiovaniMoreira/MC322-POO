//pega os dados da biblioteca e junta tudo. n de emprestimos, livros e multas


public class Relatorio {
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Livro> livros;
    private int multas;

    public Relatorio(ArrayList<Emprestimo> emprestimos, ArrayList<Livro> livros, int multas) {
        this.emprestimos = emprestimos;
        this.livros = livros;
        this.multas = multas;
    }

    public void gerarRelatorio() {
        int numeroEmprestimos = emprestimos.size();
        int numeroLivros = livros.size();

        System.out.println("Relatório da Biblioteca:");
        System.out.println("Número de Empréstimos: " + numeroEmprestimos);
        System.out.println("Número de Livros: " + numeroLivros);
        System.out.println("Número de Multas: " + multas);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crie objetos Emprestimo, Livro e configure as listas e valores de multa
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        int multas = 5;

        // Crie um objeto RelatorioBiblioteca e gere o relatório
        RelatorioBiblioteca relatorio = new RelatorioBiblioteca(emprestimos, livros, multas);
        relatorio.gerarRelatorio();
    }
}
