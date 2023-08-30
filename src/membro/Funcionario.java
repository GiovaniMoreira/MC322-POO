package src.membro;

// Definição da classe Funcionario que é uma subclasse de Pessoa
public class Funcionario extends Pessoa {
    // Atributo específico da classe Funcionario
    private String nivelAcesso; // Nível de acesso do funcionário

    // Construtor da classe Funcionario
    // Recebe o nome, RA e nível de acesso como parâmetros
    public Funcionario(String nome, int ra,int nTelefone, int CEP, String nivelAcesso) {
        super(nome, ra,nTelefone,CEP); // Chama o construtor da superclasse Pessoa para inicializar nome e ra
        this.nivelAcesso = nivelAcesso; // Inicializa o nível de acesso do funcionário
    }

    // Métodos de acesso ao atributo nivelAcesso da classe Funcionario

    // Obtém o nível de acesso do funcionário
    public String getNivelAcesso() {
        return nivelAcesso;
    }

    // Define o nível de acesso do funcionário
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
