package biblioteca.models.membro;

// Definição da classe Professor que é uma subclasse de Usuario
public class Professor extends Usuario {
    private static int limiteEmprestimos = 7;
    private static int prazoEmprestimos = 30;
    private static double valorMulta = 0.5;

    public Professor(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.limiteEmprestimos = 7;
        this.prazoEmprestimos = 30;
        this.valorMulta = 0.5;
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