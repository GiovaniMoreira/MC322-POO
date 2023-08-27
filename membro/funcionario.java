public class funcionario extends Pessoa {
    private String nivelAcesso;

    public funcionario(String nome, int ra, String nivelAcesso) {
        super(nome, ra);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    // Métodos específicos para Funcionario
    // ...
}
