import java.util.ArrayList;
public class Biblioteca {
    private int data; //Atributo que guarda a data atual, ainda precisamos estudar como implementar
    private ArrayList<Livros> estoque; // a ideia é que essa clase exista como um banco de dados dos livros disponíveis

    public Biblioteca(){
        this.data = 0; //
        this.estoque = new ArrayList<Livros>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
