package biblioteca.views;

import java.util.Map;

import biblioteca.controllers.BibliotecaController;
import biblioteca.models.itens.ItemBiblioteca;
import biblioteca.models.itens.ItemMultimidia;

public class BibliotecaViewImpl implements BibliotecaView {
    private BibliotecaController bibliotecaController;

    public BibliotecaViewImpl(BibliotecaController controller) {
        bibliotecaController = controller;
    }

    @Override
    public void mostrarItensDisponiveis(Map itens) {
        // Implementação da exibição de itens disponíveis
        for ( Object atual : itens.keySet()) {
            System.out.println("-----------------------------------------------");
            System.out.println(bibliotecaController.buscaItemPorId((Integer) atual).getItem());
            System.out.println("-----------------------------------------------");
        }
    }

    @Override
    public void mostrarItemEspecifico(ItemBiblioteca item) {
        System.out.println(item.getItem());
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