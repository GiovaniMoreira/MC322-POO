package biblioteca.views;

import biblioteca.models.itens.Emprestavel;

import java.util.Map;

public interface BibliotecaView {
    void mostrarItensDisponiveis(Map itens);
    void mostrarItemEspecifico(Emprestavel item);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}