import Item.Livros;
import adm.*;
import adm.*;
import membro.EstudantePosGraduacao;
import membro.Professor;
import membro.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        EstudantePosGraduacao al1 = new EstudantePosGraduacao("Joao", 174494);
        Livros liv1 = new Livros(1, "Duna", "F Herbert", true, 10, 1, "Aleph", "Portugues", "Ficção", "Físico");
        Professor prof1 = new Professor("Carlos", 2);
        liv1.guardar(biblioteca);
        Relatorio relatorio = new Relatorio(biblioteca);
        relatorio.gerarRelatorio();
        biblioteca.emprestar(liv1,prof1);
        relatorio.gerarRelatorio();
        biblioteca.getEmprestimos().get(0).devolver(biblioteca);
        relatorio.gerarRelatorio();
    }

}
// Apesar de conseguir ser executado o codigo no momento nao funciona muito com ele mesmo,
// nossa intencao é criar metodos que 'retirem' o livro do estoque e coloque na posse do usuario por meio
// do emprestimo, sendo a data algo determinado automaticamente