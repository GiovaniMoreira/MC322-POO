package src.membro;

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
    public double getValorMulta() {
        return Professor.valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        Professor.valorMulta = valorMulta;
    }
    public int getPrazoEmprestimos() {
        return Professor.prazoEmprestimos;
    }
    public void setPrazoEmprestimos(int prazoEmprestimos) {
        Professor.prazoEmprestimos = prazoEmprestimos;
    }

    public int getLimiteEmprestimos() {
        return Professor.limiteEmprestimos;
    }
    public void setLimiteEmprestimos(int limiteEmprestimos) {
        Professor.limiteEmprestimos = limiteEmprestimos;
    }
}
