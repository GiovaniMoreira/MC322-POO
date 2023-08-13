public class Main {
    public static void main(String[] args) {
        Biblioteca estoque =  new Biblioteca();
        Usuario joao = new Usuario(174494, "Joao");
        Livros duna4 = new Livros(1,10,"Duna 4","F. Herbert", 4, "Editora Aleph");
        Emprestimo emprestimo1 = new Emprestimo(1,duna4,joao);
    }
}

// Apesar de conseguir ser executado o codigo no momento nao funciona muito com ele mesmo,
// nossa intencao é criar metodos que 'retirem' o livro do estoque e coloque na posse do usuario por meio
// do emprestimo, sendo a data algo determinado automaticamente