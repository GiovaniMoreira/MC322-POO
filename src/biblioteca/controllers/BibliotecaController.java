package biblioteca.controllers;

import java.util.Map;

import biblioteca.models.adm.Emprestimo;
import biblioteca.models.adm.ListaEmprestimo;
import biblioteca.models.adm.ListaReserva;
import biblioteca.models.adm.Reserva;
import biblioteca.models.itens.ItemBiblioteca;
import biblioteca.models.itens.ItemMultimidia;
import biblioteca.models.membro.Membro;

public interface BibliotecaController {
    Map consultarItensDisponiveis();
    ItemBiblioteca buscaItemPorId(int Id);

    void adicionarItem(int Id, ItemBiblioteca item);

    ListaEmprestimo<Emprestimo> consultarEmprestimos();
    ListaReserva<Reserva> consultarReserva();
}