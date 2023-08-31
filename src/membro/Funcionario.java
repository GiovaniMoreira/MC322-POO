package src.membro;

// Definição da classe Funcionario que é uma subclasse de Pessoa
public class Funcionario extends Pessoa {
    private static int limiteEmprestimos = 4;
    private static int prazoEmprestimos = 20;
    private static double valorMulta = 0.75;

    public Funcionario(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }
}