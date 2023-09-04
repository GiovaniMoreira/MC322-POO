package src.membro;

import src.adm.Biblioteca;
import src.adm.Emprestimo;
import src.Item.Item;
import java.util.ArrayList;

public class Atendentes extends Funcionario {

    public Atendentes(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }

    // Realizar operação de empréstimo
    public void realizarEmprestimo(Biblioteca biblioteca, Item item, Pessoa pessoa) {
        if (pessoa.getPerfil() == PerfilMembro.EstudanteGraduacao ||
            pessoa.getPerfil() == PerfilMembro.EstudantePosGraduacao ||
            pessoa.getPerfil() == PerfilMembro.Professor ||
            pessoa.getPerfil() == PerfilMembro.Funcionario) {

            if (biblioteca.podeRealizarEmprestimo(pessoa)) {
                Emprestimo emprestimo = new Emprestimo(item, pessoa, pessoa.getPerfil());
                biblioteca.adicionarEmprestimo(emprestimo);
                pessoa.adicionarEmprestimo(emprestimo);
                System.out.println("Empréstimo realizado com sucesso!");
            } else {
                System.out.println("Limite de empréstimo excedido ou multa pendente.");
            }
        } else {
            System.out.println("Perfil de membro não permitido para empréstimos.");
        }
    }

    // Realizar operação de devolução
    public void realizarDevolucao(Biblioteca biblioteca, Emprestimo emprestimo) {
        if (pessoa.getPerfil() == PerfilMembro.EstudanteGraduacao ||
            pessoa.getPerfil() == PerfilMembro.EstudantePosGraduacao ||
            pessoa.getPerfil() == PerfilMembro.Professor ||
            pessoa.getPerfil() == PerfilMembro.Funcionario) {

            emprestimo.devolver(biblioteca);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Perfil de membro não permitido para devolução.");
        }
    }

    // Realizar operação de renovação
    public void realizarRenovacao(Emprestimo emprestimo) {
        if (emprestimo.getPessoa().getPerfil() == PerfilMembro.EstudanteGraduacao ||
            emprestimo.getPessoa().getPerfil() == PerfilMembro.EstudantePosGraduacao ||
            emprestimo.getPessoa().getPerfil() == PerfilMembro.Professor ||
            emprestimo.getPessoa().getPerfil() == PerfilMembro.Funcionario) {

            emprestimo.renovar();
            System.out.println("Renovação realizada com sucesso!");
        } else {
            System.out.println("Perfil de membro não permitido para renovação.");
        }
    }
}
