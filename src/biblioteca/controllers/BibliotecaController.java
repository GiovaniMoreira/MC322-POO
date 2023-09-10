package biblioteca.controllers;

import java.util.List;

import biblioteca.models.itens.Emprestavel;
import biblioteca.models.membro.Membro;

public interface BibliotecaController {
    List<Emprestavel> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, Emprestavel item);
    boolean devolverItem(Membro membro, Emprestavel item);
    Emprestavel buscaItemPorId(int Id);
}