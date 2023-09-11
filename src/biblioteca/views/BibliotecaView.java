package biblioteca.views;

import java.util.List;

import biblioteca.models.itens.Emprestavel;

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<Emprestavel> itens);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}