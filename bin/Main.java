package bin;

import src.Item.*;
import src.adm.*;
import src.membro.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Lista lista = new Lista("Duna");
        Item item = new Livro(1,"Duna","F herbert","Aleph","ficcao",1990,"a",2,1,4,"puta que pariu","bom");
        Administradores adm = new Administradores("gio",123,12345,"casa do caralho",1);
        adm.castrarLivro(biblioteca ,1,"Duna","F herbert","Aleph","ficcao",1990,"a",2,1,4,"puta que pariu","bom");
        System.out.println(biblioteca.getListas().get(0).getTitulo());
    }

}
// Apesar de conseguir ser executado o codigo no momento nao funciona muito com ele mesmo,
// nossa intencao é criar metodos que 'retirem' o livro do estoque e coloque na posse do usuario por meio
// do emprestimo, sendo a data algo determinado automaticamente