package src.adm;
import java.util.ArrayList;
import src.Item.*;

public class Biblioteca {
    private static int data; //Atributo que guarda a data atual, ainda precisamos estudar como implementar
    private ArrayList<Lista> listas; // Uma relação de agregação entre os itens armazenados na biblioteca e a biblioteca em si
    private ArrayList<Emprestimo> emprestimos; // Esse vetor permite ter um controle também dos emprestimos pela biblioteca ao inves de em cada usuario
    private int multas; //Esse atributo representa apenas quantos usuarios estão multados no momento

    public Biblioteca(){
        this.data = 0; //essa data eventualmente substituida por um clock interno ou algo que perceba que tempo é
        this.listas = new ArrayList<Lista>();
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    // Getters e setters
    public static int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public ArrayList<Lista> getListas(){return listas;}
    public ArrayList<Emprestimo> getEmprestimos(){return emprestimos;}

    public int getMultas(){ return multas;}

    public void setMultas(int multas){this.multas = multas;}

}
