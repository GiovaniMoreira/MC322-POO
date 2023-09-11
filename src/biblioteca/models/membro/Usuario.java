package biblioteca.models.membro;

// Importações de classes externas

import biblioteca.models.itens.Emprestavel;

import java.util.ArrayList;

// Definição da classe Usuario que é uma subclasse de Membro
public abstract class Usuario extends Membro {
    public Usuario(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.emprestimos = new ArrayList<Emprestavel>();
    }
    // Construtor da classe Usuario

    // Métodos de acesso aos atributos da classe Usuario

    // Obtém a lista de empréstimos do usuário
    public ArrayList<Emprestavel> getEmprestimos() {
        return emprestimos;
    }

    // Define a lista de empréstimos do usuário
    public void setEmprestimos(ArrayList<Emprestavel> emprestimos) {
        this.emprestimos = emprestimos;

    }
}