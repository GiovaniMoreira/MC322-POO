package biblioteca.controllers;

import java.util.Map;

import biblioteca.models.itens.ItemMultimidia;
import biblioteca.models.membro.Membro;

public interface BibliotecaController {
    Map consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item, int data);
    boolean devolverItem(Membro membro, ItemMultimidia item, int data, int IdEmprestimo);
    ItemMultimidia buscaItemPorId(int Id);

    void adicionarItem(int Id, ItemMultimidia item);
}