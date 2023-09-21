package biblioteca.models.itens;

public class ItemBiblioteca<T extends ItemMultimidia> {
    private T item;

    public ItemBiblioteca(T item){
        this.item = item;
    }


}
