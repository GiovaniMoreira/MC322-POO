import Item.Livros;
import adm.*;
import adm.*;
import membro.EstudantePosGraduacao;
import membro.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        EstudantePosGraduacao al1 = new EstudantePosGraduacao("Joao", 174494);
        Livros liv1 = new Livros(1, "Duna", "F Herbert", true, 10, 1, "Aleph", "Portugues", "Ficção", "Físico");
        liv1.guardar(biblioteca);
        biblioteca.emprestar(liv1,al1);
        System.out.println(al1.getEmprestimos().get(0).getDataDevolucao());
        biblioteca.renovar(al1.getEmprestimos().get(0));
        System.out.println(al1.getEmprestimos().get(0).getDataDevolucao());
        Relatorio relatorio = new Relatorio(biblioteca);
        relatorio.gerarRelatorio();
        biblioteca.devolver(biblioteca.getEmprestimos().get(0));
        relatorio.gerarRelatorio();
    }

}
// Apesar de conseguir ser executado o codigo no momento nao funciona muito com ele mesmo,
// nossa intencao é criar metodos que 'retirem' o livro do estoque e coloque na posse do usuario por meio
// do emprestimo, sendo a data algo determinado automaticamente