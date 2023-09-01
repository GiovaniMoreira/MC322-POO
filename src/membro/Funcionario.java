package src.membro;

import src.Item.Item;
import src.adm.Biblioteca;
import src.adm.Emprestimo;
import src.adm.Reserva;

// Definição da classe Funcionario que é uma subclasse de Pessoa
public class Funcionario extends Pessoa {
    private static int limiteEmprestimos = 4;
    private static int prazoEmprestimos = 20;
    private static double valorMulta = 0.75;
    protected static Biblioteca biblioteca;

    public Funcionario(String nome, int ra, int nTelefone, String endereco, int dataRegistro, Biblioteca biblioteca ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
        this.biblioteca = biblioteca;
    }
    public void emprestar(Pessoa pessoa, Item item){
        if (item.getReserva() == null || item.getReserva() == pessoa) {
            Emprestimo emprestimo = new Emprestimo(item, pessoa, biblioteca);
            emprestimo.empresta();
            return;
        } else {
            System.out.println("Item reservado");
        }
    }

    public void reservar(Pessoa pessoa, Item item){
        new Reserva(pessoa, item, biblioteca.getData()).reservar();
    }
}