package biblioteca.controllers;

import biblioteca.models.membro.Membro;

import java.util.List;

public interface MembroController {
    List<Membro> listarMembros();
    Membro buscarMembroPorIdentificacao(int identificacao);

    void addMembro(Membro membro);
}