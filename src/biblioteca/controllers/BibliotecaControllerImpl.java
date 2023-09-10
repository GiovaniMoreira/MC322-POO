package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.itens.Emprestavel;
import biblioteca.models.membro.Membro;

public class BibliotecaControllerImpl implements BibliotecaController {
    private List<Emprestavel> itens;

    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
    }

    @Override
    public List<Emprestavel> consultarItensDisponiveis() {
        return itens;
    }

    @Override
    public boolean emprestarItem(Membro membro, Emprestavel item) {
        if (item.getDisponibilidade() == true) {
            membro.getEmprestimos().add(item);
            item.setDisponibilidade(false);

        }
        return false;
    }

    @Override
    public boolean devolverItem(Membro membro, Emprestavel item) {
        return false;
    }

    @Override
    public Emprestavel buscaItemPorId(int Id) {
        for ( Emprestavel item : itens){
            if (item.getTombo() == Id);
            return item;
        }
        return null;
    }
}