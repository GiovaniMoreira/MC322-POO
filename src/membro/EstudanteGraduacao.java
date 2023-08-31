package src.membro;

// Definição da classe EstudanteGraduacao que é uma subclasse de Usuario
public class EstudanteGraduacao extends Usuario {
    private static int limiteEmprestimos = 3;
    private static int prazoEmprestimos = 15;
    private static double valorMulta = 1;

    public EstudanteGraduacao(String nome, int ra, int nTelefone, int CEP) {
        super(nome, ra, nTelefone, CEP);
    }

}
