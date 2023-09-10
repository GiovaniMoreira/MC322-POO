package biblioteca.models;

import java.util.Scanner;

public class Sala {
    public enum tipoSala{
        individual,grupo,silenciosa,multimidia
    }
    private int nSala;
    private tipoSala tipoSala;
    private Sindividual individual;
    private Sgrupo grupo;
    private Ssilenciosa silenciosa;
    private Smultimidia multimidia;

    //Construtor
    public Sala(int nSala, tipoSala tipoSala){
        this.nSala = nSala;
        Scanner scanner = new Scanner(System.in);
        switch(tipoSala){
            case individual:
                System.out.println("Pc disponível na sala? Insira 'true' ou 'false' ");
                boolean pcDisp = scanner.nextBoolean();
                this.individual = new Sindividual(pcDisp);
                break;
            case grupo:
                System.out.println("Insira a capacidade da sala: ");
                int cap = scanner.nextInt();
                System.out.println("Insira os equipamentos disponíveis na sala: ");
                String equip = scanner.next();
                this.grupo = new Sgrupo(cap,equip);
                break;
            case silenciosa:
                System.out.println("Insira o número de assentos disponíveis na sala: ");
                int ass = scanner.nextInt();
                System.out.println("A sala tem cabines individuais? Insira 'true' ou 'false'");
                boolean cabine = scanner.nextBoolean();
                this.silenciosa = new Ssilenciosa(ass,cabine);
                break;
            case multimidia:
                System.out.println("Insira os equipamentos disponiveis na sala");
                String equipS = scanner.next();
                this.multimidia = new Smultimidia(equipS);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + tipoSala);
        }
    }
    class Sindividual{
        private boolean pcDisponivel;

        public Sindividual(boolean pcDisponivel) {
            this.pcDisponivel = pcDisponivel;
        }
    }
    class Sgrupo{
        private int capSala;
        private String equipDisponivel;

        Sgrupo(int capSala, String equipDisponivel) {
            this.capSala = capSala;
            this.equipDisponivel = equipDisponivel;
        }
    }
    class Ssilenciosa{
        private int nAssentos;
        private boolean assentoIndividual;

        Ssilenciosa(int nAssentos, boolean assentoIndividual) {
            this.nAssentos = nAssentos;
            this.assentoIndividual = assentoIndividual;
        }
    }
    class Smultimidia{
        private String equipDisponivel;

        Smultimidia(String equipDisponivel) {
            this.equipDisponivel = equipDisponivel;
        }
    }
}
