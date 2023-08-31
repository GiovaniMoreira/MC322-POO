package src.membro;

import src.Item.Item;
import src.adm.Biblioteca;
import src.adm.Emprestimo;

// Definição da classe Funcionario que é uma subclasse de Pessoa
public class Funcionario extends Pessoa {
    private static int limiteEmprestimos = 4;
    private static int prazoEmprestimos = 20;
    private static double valorMulta = 0.75;

    public Funcionario(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }
    private void emprestar(Pessoa pessoa, Item item, Biblioteca biblioteca){
        Emprestimo emprestimo = new Emprestimo(item, pessoa);
        pessoa.getEmprestimos().add(emprestimo);
        biblioteca.getEmprestimos().add(emprestimo);
    }
}