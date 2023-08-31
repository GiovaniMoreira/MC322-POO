package src.membro;

// Importações de classes externas
import src.adm.Biblioteca;
import src.adm.Emprestimo;
import src.Item.*; // Importa classes do pacote Item

import java.util.ArrayList;

// Definição da classe Usuario que é uma subclasse de Pessoa
public class Atendentes extends Funcionario {
    public Atendentes(String nome, int ra, int nTelefone, String endereco, int dataRegistro, Biblioteca biblioteca) {
        super(nome, ra, nTelefone, endereco, dataRegistro,biblioteca);
    }
    }