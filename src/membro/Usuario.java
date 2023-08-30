package src.membro;

// Importações de classes externas
import adm.Emprestimo;
import Item.*; // Importa classes do pacote Item

import java.util.ArrayList;

// Definição da classe Usuario que é uma subclasse de Pessoa
public class Usuario extends Pessoa {
    // Atributos da classe Usuario
    private ArrayList<Emprestimo> emprestimos; // Lista de empréstimos do usuário
    private int multa = 0; // Valor da multa do usuário
    int nivel; // Nível do usuário

    // Construtor da classe Usuario
    public Usuario(String nome, int ra) {
        super(nome, ra); // Chama o construtor da superclasse Pessoa para inicializar nome e ra
        this.emprestimos = new ArrayList<Emprestimo>(); // Inicializa a lista de empréstimos
    }

    // Métodos de acesso aos atributos da classe Usuario

    // Obtém a lista de empréstimos do usuário
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    // Define a lista de empréstimos do usuário
    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    // Obtém o nível do usuário
    public int getNivel() {
        return nivel;
    }

    // Método para realizar um empréstimo
    public void emprestar(Item item) {
        emprestimos.add(new Emprestimo(item, this)); // Adiciona um novo empréstimo à lista
    }

    // Obtém o valor da multa do usuário
    public int getMulta() {
        return multa;
    }

    // Define o valor da multa do usuário
    public void setMulta(int multa) {
        this.multa = multa;
    }
}
