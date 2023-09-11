package biblioteca.models.membro;

// Definição da classe EstudantePosGraduacao que é uma subclasse de Usuario
 public class EstudantePosGraduacao extends Usuario {
    private static int limiteEmprestimos = 5;
    private static int prazoEmprestimos = 20;
    private static double valorMulta = 1;

    public EstudantePosGraduacao(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }

    @Override
    public double getValorMulta() {
        return valorMulta;
    }

    @Override
    public void setValorMulta(double valorMulta) {

    }

    @Override
    public int getPrazoEmprestimos() {
        return prazoEmprestimos;
    }

    @Override
    public void setPrazoEmprestimos(int prazoEmprestimos) {

    }

    @Override
    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    @Override
    public void setLimiteEmprestimos(int limiteEmprestimos) {

    }
}