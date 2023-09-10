package biblioteca.controllers;

import java.util.List;

import biblioteca.models.Membro;
import biblioteca.models.membro.Membro;

public interface MembroController {
    List<Membro> listarMembros();
    Membro buscarMembroPorIdentificacao(int identificacao);
}