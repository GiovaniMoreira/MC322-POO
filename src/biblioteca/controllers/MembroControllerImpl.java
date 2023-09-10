package biblioteca.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import biblioteca.models.membro.Membro;

public class MembroControllerImpl implements MembroController {
    private List<Membro> membros;

    public MembroControllerImpl() {
        membros = new ArrayList<>();
    }

    @Override
    public List<Membro> listarMembros() {
        return membros;
    }

    @Override
    public Membro buscarMembroPorIdentificacao(int identificacao) {
        // Lógica de busca
        Iterator<Membro> iterador = membros.iterator();
        while (iterador.hasNext()){
            Membro atual = iterador.next();
            if(atual.getRa() == identificacao);
                return atual;
        }
        return null;
    }
}