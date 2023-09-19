package biblioteca.models.membro;

// Definição da classe Funcionario que é uma subclasse de Membro
public abstract class Funcionario extends Membro {
    private  int limiteEmprestimos = 4;
    private  int prazoEmprestimos = 20;
    private  double valorMulta = 0.75;

    public Funcionario(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.limiteEmprestimos = 4;
        this.prazoEmprestimos = 20;
        this.valorMulta = 0.75;
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

    @Override
    public String toString(){
        String texto = "Nome: " + this.nome + "\n";
        return texto;
    }
}