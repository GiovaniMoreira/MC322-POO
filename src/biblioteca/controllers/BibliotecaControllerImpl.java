package biblioteca.controllers;

import java.util.HashMap;
import java.util.Map;

import biblioteca.models.adm.Emprestimo;
import biblioteca.models.adm.ListaEmprestimo;
import biblioteca.models.adm.ListaReserva;
import biblioteca.models.adm.Reserva;
import biblioteca.models.itens.ItemBiblioteca;
import biblioteca.models.itens.ItemMultimidia;
import biblioteca.models.membro.Membro;

public class BibliotecaControllerImpl implements BibliotecaController {
    private HashMap<Integer, ItemBiblioteca> estoque;
    private ListaEmprestimo<Emprestimo> emprestimos;
    private ListaReserva<Reserva> reservas;
    private static int idEmprestimo;

    private int gerarChaveHash(int Id){
        return Id % 1000;
    }

    public BibliotecaControllerImpl() {
        HashMap<Integer, ItemBiblioteca> estoque = new HashMap<Integer, ItemBiblioteca>();
        this.estoque = estoque;
        ListaEmprestimo<Emprestimo> emprestimos = new ListaEmprestimo<>();
        this.emprestimos = emprestimos;
        ListaReserva<Reserva> reservas = new ListaReserva<>();
        this.reservas = reservas;
        this.idEmprestimo = 0;
    }

    @Override
    public Map consultarItensDisponiveis() {
        return estoque;
    }


    @Override
    public ItemBiblioteca buscaItemPorId(int Id) {
        int chave = gerarChaveHash(Id);
        if (estoque.containsKey(chave)){
            return estoque.get(chave);
        }
        return null;
    }


    /*
    public void adicionarItem(int Id, ItemBiblioteca item){
        this.estoque.put(Id,item);
    }
    */

    @Override
    public ListaEmprestimo<Emprestimo> consultarEmprestimos() {
        return emprestimos;
    }

    @Override
    public ListaReserva<Reserva> consultarReserva() {
        return reservas;
    }
    private boolean verificarTiposDeDados(int Id, ItemBiblioteca item) {
        if (item == null) {
            return false; 
        }

        if (Id <= 0) {
            return false; 
        }

        if (!(item instanceof ItemBiblioteca)) {
            return false; 
        }

        return true; 
    }

    public void adicionarItem(int Id, ItemBiblioteca item) {
        if (verificarTiposDeDados(Id, item)) {
            int chave = gerarChaveHash(Id);
            this.estoque.put(chave, item);
        } else {
            System.err.println("Erro: Dados inseridos não correspondem aos tipos esperados.");
        }
    }

}