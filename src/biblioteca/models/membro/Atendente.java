package biblioteca.models.membro;

// Importações de classes externas

// Definição da classe Usuario que é uma subclasse de Pessoa
public class Atendente extends Funcionario {
    public Atendente(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }
}