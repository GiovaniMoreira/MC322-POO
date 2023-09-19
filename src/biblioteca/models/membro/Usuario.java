package biblioteca.models.membro;

// Importações de classes externas

import biblioteca.models.adm.Emprestimo;

import java.util.HashSet;

// Definição da classe Usuario que é uma subclasse de Membro
public abstract class Usuario extends Membro {
    public Usuario(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.emprestimos = new java.util.HashSet<>();
    }
    // Construtor da classe Usuario

    // Métodos de acesso aos atributos da classe Usuario

    // Obtém a lista de empréstimos do usuário
    public HashSet<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    // Define a lista de empréstimos do usuário
    public void setEmprestimos(HashSet<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;

    }
    @Override
    public String toString(){
        String texto =  "Nome: " + this.nome + "\n" +
                        "RA: " + this.ra + "\n" +
                        "Número de Telefone: " + this.nTelefone + "\n" +
                        "Endereço: " + this.endereco + "\n" +
                        "Data de Registro: " + this.dataRegistro + "\n";
        return texto;
    }
}