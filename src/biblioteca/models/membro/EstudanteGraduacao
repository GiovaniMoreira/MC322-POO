package biblioteca.models.membro;

// Definição da classe EstudanteGraduacao que é uma subclasse de Usuario
public class EstudanteGraduacao extends Usuario {
    private static int limiteEmprestimos = 3;
    private static int prazoEmprestimos = 15;
    private static double valorMulta = 1;

    public EstudanteGraduacao (String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.limiteEmprestimos = 3;
        this.prazoEmprestimos =15;
        this.valorMulta = 1;
    }

    @Override
    public double getValorMulta() {
        return EstudanteGraduacao.valorMulta;
    }

    @Override
    public void setValorMulta(double valorMulta) {
        EstudanteGraduacao.valorMulta = valorMulta;
    }

    @Override
    public int getPrazoEmprestimos() {
        return EstudanteGraduacao.prazoEmprestimos;
    }

    @Override
    public void setPrazoEmprestimos(int prazoEmprestimos) {
        EstudanteGraduacao.prazoEmprestimos = prazoEmprestimos;
    }

    @Override
    public int getLimiteEmprestimos() {
        return EstudanteGraduacao.limiteEmprestimos;
    }

    @Override
    public void setLimiteEmprestimos(int limiteEmprestimos) {
        EstudanteGraduacao.limiteEmprestimos = limiteEmprestimos;
    }

}