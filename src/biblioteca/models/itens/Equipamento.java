package biblioteca.models.itens;

import biblioteca.models.adm.Reserva;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipamento implements Emprestavel {
    private int tombo;
    private boolean disponibilidade;
    private ArrayList<Reserva> reservas;
    private int nEmprestimos;
    private int nReservas;

    public int getTombo() {
        return tombo;
    }

    @Override
    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public ArrayList<Reserva> getReserva() {
        return reservas;
    }

    @Override
    public void setnEmprestimos(int i) {
        nEmprestimos = i;
    }
    @Override
    public void reserva(int idMembro) {
        Reserva reserva = new Reserva( idMembro, this.getTombo());
        this.reservas.add(reserva);
        nReservas += 1;
        this.disponibilidade = false;
    }

    @Override
    public int getnEmprestimos() {
        return nEmprestimos;
    }

    @Override
    public void setnReservas(int i) {
        nReservas = i;
    }

    @Override
    public int getnReservas() {
        return nReservas;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public enum CategoriaEquipamento{
        INFORMATICA,AUDIOVISUAL,IMPRESSAO
    }
    private CategoriaEquipamento categoria;
    private Informatica informatica;
    private AudioVisual audiovisual;
    private Impressao impressao;
    public Equipamento(CategoriaEquipamento categoria, int tombo){
        this.tombo = tombo;
        this.disponibilidade = true;
        ArrayList<Reserva> reservas = new ArrayList<Reserva>(1);
        this.reservas = reservas;
        Scanner scanner = new Scanner(System.in);
        switch(categoria){
            case INFORMATICA:
                System.out.println("Insira o tipo de item de informatica: ");
                String tipoI = scanner.next();
                System.out.println("Insira as especificações do item: ");
                String espI = scanner.next();
                this.informatica = new Informatica(tipoI, espI);
                break;
            case AUDIOVISUAL:
                System.out.println("Insira o tipo de item audiovisual: ");
                String tipoA = scanner.next();
                System.out.println("Insira as especificações do item: ");
                String espA = scanner.next();
                this.audiovisual = new AudioVisual(tipoA,espA);
                break;
            case IMPRESSAO:
                System.out.println("Insira o modelo do item de impressao: ");
                String tipoImp = scanner.next();
                System.out.println("Insira a resolução máxima do item: ");
                int resImp = scanner.nextInt();
                System.out.println("Insira a capacidade máxima do item: ");
                int capImp = scanner.nextInt();
                this.impressao = new Impressao(tipoImp,resImp,capImp);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + categoria);
        }
    }
    class Informatica{
        private String tipo;
        private String especificacoes;

        Informatica(String tipo, String especificacoes) {
            this.tipo = tipo;
            this.especificacoes = especificacoes;
        }

        public String getEspecificacoes() {
            return especificacoes;
        }

        public void setEspecificacoes(String especificacoes) {
            this.especificacoes = especificacoes;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }
    class AudioVisual{
        private String tipo;
        private String especificaoes;

        AudioVisual(String tipo, String especificaoes) {
            this.tipo = tipo;
            this.especificaoes = especificaoes;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getEspecificaoes() {
            return especificaoes;
        }

        public void setEspecificaoes(String especificaoes) {
            this.especificaoes = especificaoes;
        }
    }
    class Impressao{
        private String modelo;
        private int resolucao;
        private int capacidade;

        public int getCapacidade() {
            return capacidade;
        }
        public Impressao(String modelo, int resolucao, int capacidade){
            this.modelo = modelo;
            this.resolucao = resolucao;
            this.capacidade = capacidade;
        }
        public void setCapacidade(int capacidade) {
            this.capacidade = capacidade;
        }

        public int getResolucao() {
            return resolucao;
        }

        public void setResolucao(int resolucao) {
            this.resolucao = resolucao;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }
    @Override
    public String toString(){
        String texto = "Tombo: " + tombo + "\n" +
                "Número de vezes que foi emprestado: " + nEmprestimos + "\n" +
                "Número de vezes que foi reservado: " + nReservas + "\n" +
                "Número de pessoas na fila de reserva: " + reservas.size() + "\n" +
                "Disponibilidade: " + disponibilidade + "\n" +
                "Formato: " + categoria.toString() + "\n";
        switch (categoria) {
            case INFORMATICA:
                texto += "Tipo de item de informática: " + informatica.tipo + "\n" +
                        "Especificações do item: " + informatica.especificacoes + "\n";
                break;
            case AUDIOVISUAL:
                texto += "Tipo de item de informática: " + audiovisual.tipo + "\n" +
                        "Especificações do item: " + audiovisual.especificaoes + "\n";
                break;
            case IMPRESSAO:
                texto += "Modelo do Item: " + impressao.modelo + "\n" +
                        "Resolução máxima: " + impressao.resolucao + "\n" +
                        "Capacidade máxima: " + impressao.capacidade + "\n";
                break;
        }
        return texto;
    }
}
