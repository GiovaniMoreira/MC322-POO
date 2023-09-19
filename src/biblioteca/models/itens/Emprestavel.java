package biblioteca.models.itens;

import biblioteca.models.adm.Reserva;

import java.util.ArrayList;

public interface Emprestavel {
    int getTombo();
    void setTombo(int tombo);
    boolean getDisponibilidade();
    void setDisponibilidade(boolean disponibilidade);

    ArrayList<Reserva> getReserva();

    void setnEmprestimos(int i);

    int getnEmprestimos();
    void setnReservas(int i);
    int getnReservas();

    void reserva(int id);
}
