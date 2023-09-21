package biblioteca.views;

import biblioteca.models.itens.ItemMultimidia;

import java.util.Map;

public interface BibliotecaView {
    void mostrarItensDisponiveis(Map itens);
    void mostrarItemEspecifico(ItemMultimidia item);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}