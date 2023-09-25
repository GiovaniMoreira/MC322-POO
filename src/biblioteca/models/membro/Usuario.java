package biblioteca.models.membro;

// Importações de classes externas

import biblioteca.models.adm.Emprestimo;
import biblioteca.models.adm.ListaEmprestimo;

import java.util.HashSet;

// Definição da classe Usuario que é uma subclasse de Membro
public abstract class Usuario extends Membro {
    public Usuario(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.emprestimos = new ListaEmprestimo<>();
    }
    // Construtor da classe Usuario

    // Métodos de acesso aos atributos da classe Usuario

    // Obtém a lista de empréstimos do usuário
    public ListaEmprestimo<Emprestimo> getEmprestimos() {
        return emprestimos;
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