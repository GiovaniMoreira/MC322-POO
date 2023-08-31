package src.membro;

// Definição da classe Professor que é uma subclasse de Usuario
public class Professor extends Usuario {
    private static int limiteEmprestimos = 7;
    private static int prazoEmprestimos = 30;
    private static double valorMulta = 0.5;

    public Professor(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }
    // Construtor da classe Professor
    // Recebe o nome e o RA do professor como parâmetros

}
