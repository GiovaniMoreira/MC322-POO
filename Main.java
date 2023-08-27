import Item.Livros;
import adm.Biblioteca;
import adm.Emprestimo;
import membro.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca estoque = new Biblioteca();
        Usuario al1 = new Usuario("Joao", 174494);
        Livros liv1 = new Livros(1, "Duna", "F Herbert", true, 10, 1, "Aleph", "Portugues", "Ficção", "Físico");
        al1.emprestar(liv1);
    }

}
// Apesar de conseguir ser executado o codigo no momento nao funciona muito com ele mesmo,
// nossa intencao é criar metodos que 'retirem' o livro do estoque e coloque na posse do usuario por meio
// do emprestimo, sendo a data algo determinado automaticamente