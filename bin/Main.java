package bin;

import src.Item.*;
import src.adm.*;
import src.membro.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Lista lista = new Lista("Duna");
        Item item = new Livro(1,"Duna","F herbert","Aleph","ficcao",1990,"a",2,1,4,"puta que pariu","bom");
        lista.getLista().add(item);
        item.setnEmprestimos(2);
        item.setnReservas(4);
        biblioteca.getListas().add(lista);
        Relatorio relatorio = new Relatorio(biblioteca);
        relatorio.gerarRelatóriItens(biblioteca);
    }

}
// Apesar de conseguir ser executado o codigo no momento nao funciona muito com ele mesmo,
// nossa intencao é criar metodos que 'retirem' o livro do estoque e coloque na posse do usuario por meio
// do emprestimo, sendo a data algo determinado automaticamente