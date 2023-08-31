package src.membro;

// Definição da classe EstudantePosGraduacao que é uma subclasse de Usuario
 public class EstudantePosGraduacao extends Usuario {
    private static int limiteEmprestimos = 5;
    private static int prazoEmprestimos = 20;
    private static double valorMulta = 1;

    public EstudantePosGraduacao(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }
    // Construtor da classe EstudantePosGraduacao
    // Recebe o nome e o RA do estudante como parâmetros

}
