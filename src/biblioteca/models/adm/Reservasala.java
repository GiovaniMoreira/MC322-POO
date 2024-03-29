package biblioteca.models.adm;

import biblioteca.models.membro.Membro;

import java.util.Scanner;

public class Reservasala {
    private int capacidade;

    public enum tipoSala{
        individual,grupo,silenciosa,multimidia
    }
    private tipoSala tipoSala;
    private int dataReserva;
    private int horaInicio;
    private int horaFim;
    private Sala sala;
    private Membro membro;
    private  boolean disponibiidade;

    public class SalaJaReservadaException extends Exception {
        public SalaJaReservadaException(String message) {
            super(message);
        }
    }

    public class CapacidadeExcedidaException extends Exception {
        public CapacidadeExcedidaException(String message) {
            super(message);
        }
    }
    

    //Construtor
    public Reservasala(int nSala, tipoSala tipoSala, int dataReserva, int horaInicio, Membro membro, int usuarios, int capacidade){
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaInicio + 3;
        this.membro = membro;
        this.capacidade = capacidade;

        try{
            if (salaEstaReservada(dataReserva, horaInicio)){
                throw new SalaJaReservadaException("Esta sala já foi reservada");

            } else if (usuarios > this.capacidade){
                throw new CapacidadeExcedidaException("A capacidade máxima da sala foi excedida");

            }

            Scanner scanner = new Scanner(System.in);
            switch(tipoSala){
                case individual:
                    System.out.println("Pc disponível na sala? Insira 'true' ou 'false' ");
                    boolean pcDisp = scanner.nextBoolean();
                    this.sala = new Sindividual(nSala, pcDisp);
                    break;
                case grupo:
                    System.out.println("Insira a capacidade da sala: ");
                    int cap = scanner.nextInt();
                    System.out.println("Insira os equipamentos disponíveis na sala: ");
                    String equip = scanner.next();
                    this.sala = new Sgrupo(nSala, cap,equip);
                    break;
                case silenciosa:
                    System.out.println("Insira o número de assentos disponíveis na sala: ");
                    int ass = scanner.nextInt();
                    System.out.println("A sala tem cabines individuais? Insira 'true' ou 'false'");
                    boolean cabine = scanner.nextBoolean();
                    this.sala = new Ssilenciosa(nSala, ass,cabine);
                    break;
                case multimidia:
                    System.out.println("Insira os equipamentos disponiveis na sala");
                    String equipS = scanner.next();
                    this.sala = new Smultimidia(nSala, equipS);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + tipoSala);
            }
        } catch (SalaJaReservadaException | CapacidadeExcedidaException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private boolean salaEstaReservada(int dataReserva, int horaInicio) {
        if (disponibiidade) {return true;}
        else{ return false;}
    }


    private enum ReservaSala{
        PENDENTE, CONFIRMADA, CANCELADA;
        private String status;
    }



    class Sala{
    }
    class Sindividual extends Sala{
        private int nSala;
        private boolean pcDisponivel;

        public Sindividual(int nSala, boolean pcDisponivel) {
            this.nSala = nSala;
            this.pcDisponivel = pcDisponivel;
        }
    }
    class Sgrupo extends Sala{
        private int nSala;

        private int capSala;
        private String equipDisponivel;

        Sgrupo(int nSala, int capSala, String equipDisponivel) {
            this.nSala = nSala;
            this.capSala = capSala;
            this.equipDisponivel = equipDisponivel;
        }
    }
    class Ssilenciosa extends Sala{
        private int nSala;
        private int nAssentos;
        private boolean assentoIndividual;

        Ssilenciosa(int nSala, int nAssentos, boolean assentoIndividual) {
            this.nSala = nSala;
            this.nAssentos = nAssentos;
            this.assentoIndividual = assentoIndividual;
        }
    }
    class Smultimidia extends Sala{
        private int nSala;
        private String equipDisponivel;

        Smultimidia(int nSala, String equipDisponivel) {
            this.nSala = nSala;
            this.equipDisponivel = equipDisponivel;
        }
    }
}
