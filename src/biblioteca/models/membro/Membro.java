package biblioteca.models.membro;

import src.adm.Emprestimo;
import src.adm.Reserva;

import java.util.ArrayList;

// Definição da classe Membro
public abstract class Membro {
    // Atributos protegidos da classe Membro
    protected String nome;         // Nome da Membro
    protected int ra;              // Registro Acadêmico
    protected int nTelefone;       // Número de telefone
    protected int CEP;// Código de Endereço Postal (CEP)
    protected String endereco;
    protected int dataRegistro;// Código de Endereço Postal (CEP)
    protected ArrayList<Emprestimo> emprestimos; // Lista de empréstimos do usuário
    protected int multa; // Valor da multa do usuário
    private static int limiteEmprestimos;
    private static int prazoEmprestimos;
    private static double valorMulta;
    private ArrayList<Reserva> reserva;
    // Construtor da classe Membro
    public Membro(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        this.nome = nome;
        this.ra = ra;
        this.nTelefone = nTelefone;
        this.CEP = CEP;
        this.endereco = endereco;
        this.dataRegistro = dataRegistro;
        this.reserva = new ArrayList<Reserva>(0);
        this.emprestimos = new ArrayList<Emprestimo>(0);
    }

    public abstract double getValorMulta();

    public abstract void setValorMulta(double valorMulta);

    public abstract int getPrazoEmprestimos();

    public abstract void setPrazoEmprestimos(int prazoEmprestimos) ;

    public abstract int getLimiteEmprestimos();

    public abstract void setLimiteEmprestimos(int limiteEmprestimos);

    // Métodos de acesso aos atributos da classe Membro

    // Obtém o nome da Membro
    public String getNome() {
        return nome;
    }

    // Define o nome da Membro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Obtém o Registro Acadêmico da Membro
    public int getRa() {
        return ra;
    }

    // Define o Registro Acadêmico da Membro
    public void setRa(int ra) {
        this.ra = ra;
    }

    // Obtém o número de telefone da Membro
    public int getnTelefone() {
        return nTelefone;
    }

    // Define o número de telefone da Membro
    public void setnTelefone(int nTelefone) {
        this.nTelefone = nTelefone;
    }
    
    // Métodos de acesso ao CEP da Membro

    // Obtém o CEP da Membro
    public int getCEP() {
        return CEP;
    }

    // Define o CEP da Membro
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getendereco() {
        return endereco;
    }

    // Define o CEP da Membro
    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public int getdataRegistro() {
        return dataRegistro;
    }

    public void setdataRegistro(int dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    public ArrayList<Emprestimo> getEmprestimos(){
        return emprestimos;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }
}