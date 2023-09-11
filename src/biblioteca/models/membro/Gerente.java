package biblioteca.models.membro;

// Importações de classes externas
import src.adm.Biblioteca;
import src.adm.Emprestimo;
import src.Item.*; // Importa classes do pacote Item

import java.util.ArrayList;

// Definição da classe Usuario que é uma subclasse de Pessoa
public class Gerentes extends Funcionario {
    public Gerentes(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);

    }
}