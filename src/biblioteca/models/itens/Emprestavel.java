package biblioteca.models.itens;

public interface Emprestavel {
    int getTombo();
    void setTombo(int tombo);
    boolean getDisponibilidade();
    void setDisponibilidade(boolean disponibilidade);
}