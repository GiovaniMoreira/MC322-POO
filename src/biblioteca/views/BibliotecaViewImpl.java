package biblioteca.views;

import java.util.Map;

import biblioteca.controllers.BibliotecaController;
import biblioteca.models.itens.Emprestavel;
import biblioteca.models.itens.Item;

public class BibliotecaViewImpl implements BibliotecaView {
    private BibliotecaController bibliotecaController;

    public BibliotecaViewImpl(BibliotecaController controller) {
        bibliotecaController = controller;
    }

    @Override
    public void mostrarItensDisponiveis(Map itens) {
        // Implementação da exibição de itens disponíveis
        for (Object item: itens.values()) {
            System.out.println("-----------------------------------------------");
            System.out.println(item);
            System.out.println("-----------------------------------------------");
        }
    }

    @Override
    public void mostrarItemEspecifico(Emprestavel item) {
        System.out.println(item);
    }

    @Override
    public void mostrarEmprestimoStatus(boolean sucesso) {
        if (sucesso) {
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Falha ao realizar o empréstimo.");
        }
    }

    @Override
    public void mostrarDevolucaoStatus(boolean sucesso) {
        if (sucesso) {
            System.out.println("Devolução realizada com sucesso.");
        } else {
            System.out.println("Falha ao realizar a devolução.");
        }
    }
}