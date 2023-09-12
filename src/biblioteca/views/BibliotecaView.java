package biblioteca.views;

import java.util.Map;

public interface BibliotecaView {
    void mostrarItensDisponiveis(Map itens);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}