package src.adm;
import src.Item.Item;
import src.membro.Pessoa;

public class Reserva {
    private Map<Item, Queue<Pessoa>> reservas;

    public Reserva() {
        this.reservas = new HashMap<>();
    }

    public void fazerReserva(Item item, Pessoa membro) {
        if (!reservas.containsKey(item)) {
            reservas.put(item, new LinkedList<>());
        }
        reservas.get(item).add(membro);
        System.out.println(membro.getNome() + " fez uma reserva para " + item.getTitulo());
    }

    public void cancelarReserva(Item item, Pessoa membro) {
        if (reservas.containsKey(item)) {
            reservas.get(item).remove(membro);
            System.out.println(membro.getNome() + " cancelou a reserva para " + item.getTitulo());
        }
    }

    public void processarDevolucao(Item item) {
        if (reservas.containsKey(item) && !reservas.get(item).isEmpty()) {
            Pessoa proximoMembro = reservas.get(item).poll();
            System.out.println("Cópia de " + item.getTitulo() + " disponível para empréstimo a " + proximoMembro.getNome());
            // Notifique o membro sobre a disponibilidade
        }
    }
}
