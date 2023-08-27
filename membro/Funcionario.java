package membro;

public class Funcionario extends Pessoa {
    private String nivelAcesso;

    public Funcionario(String nome, int ra, String nivelAcesso) {
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
