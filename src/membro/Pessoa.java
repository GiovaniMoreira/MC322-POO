package src.membro;

// Definição da classe Pessoa
public class Pessoa {
    // Atributos protegidos da classe Pessoa
    protected String nome;         // Nome da pessoa
    protected int ra;              // Registro Acadêmico
    protected int nTelefone;       // Número de telefone
    protected int CEP;             // Código de Endereço Postal (CEP)

    // Construtor da classe Pessoa
    public Pessoa(String nome, int ra, int nTelefone, int CEP ) {
        this.nome = nome;
        this.ra = ra;
        this.nTelefone = nTelefone;
        this.CEP = CEP;
    }

    // Métodos de acesso aos atributos da classe Pessoa

    // Obtém o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Define o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Obtém o Registro Acadêmico da pessoa
    public int getRa() {
        return ra;
    }

    // Define o Registro Acadêmico da pessoa
    public void setRa(int ra) {
        this.ra = ra;
    }

    // Obtém o número de telefone da pessoa
    public int getnTelefone() {
        return nTelefone;
    }

    // Define o número de telefone da pessoa
    public void setnTelefone(int nTelefone) {
        this.nTelefone = nTelefone;
    }
    
    // Métodos de acesso ao CEP da pessoa

    // Obtém o CEP da pessoa
    public int getCEP() {
        return CEP;
    }

    // Define o CEP da pessoa
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
}
