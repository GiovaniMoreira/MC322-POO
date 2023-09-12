package biblioteca.controllers;

import java.util.Map;

import biblioteca.models.itens.Emprestavel;
import biblioteca.models.membro.Membro;

public interface BibliotecaController {
    Map consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, Emprestavel item, int data);
    boolean devolverItem(Membro membro, Emprestavel item, int data);
    Emprestavel buscaItemPorId(int Id);
}