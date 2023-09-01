package src.adm;

import src.Item.Item;
import src.membro.Pessoa;

public class Reserva {
    protected final Pessoa pessoa;
    protected final Item item;
    protected final int data;

    public Reserva(Pessoa pessoa, Item item, int data){
        this.item = item;
        this.pessoa = pessoa;
        this.data = data;
    }
    public void reservar(){
        item.setReserva(pessoa);
        item.setnReservas(item.getnReservas()+1);
        pessoa.getReserva().add(this);
        item.setDisponibilidade(false);
        System.out.println(item.getTitulo()+" reservado por "+pessoa.getNome());
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Item getItem() {
        return item;
    }

    public int getData() {
        return data;
    }
}
