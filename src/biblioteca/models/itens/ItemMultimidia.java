package biblioteca.models.itens;

import biblioteca.models.adm.Reserva;
import java.util.List;

// Interface principal para itens multimídia
public interface ItemMultimidia {
    int getTombo();
    void setTombo(int tombo);
    boolean getDisponibilidade();
    void setDisponibilidade(boolean disponibilidade);
}

// Interface para itens que podem ser emprestados
public interface ItemEmprestavel extends ItemMultimidia {
    int getNumeroEmprestimos();
    void setNumeroEmprestimos(int numeroEmprestimos);
}

// Interface para itens que podem ser reservados
public interface ItemReservavel extends ItemMultimidia {
    List<Reserva> getReservas();
    int getNumeroReservas();
    void setNumeroReservas(int numeroReservas);
}

