package biblioteca.models.membro;

import src.Item.Item;
import src.adm.Biblioteca;
import src.adm.Emprestimo;
import src.adm.Reserva;

// Definição da classe Funcionario que é uma subclasse de Membro
public class Funcionario extends Membro {
    private static int limiteEmprestimos = 4;
    private static int prazoEmprestimos = 20;
    private static double valorMulta = 0.75;
    protected static Biblioteca biblioteca;

    public Funcionario(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.biblioteca = biblioteca;
        this.limiteEmprestimos = 4;
        this.prazoEmprestimos = 20;
        this.valorMulta = 0.75;
    }