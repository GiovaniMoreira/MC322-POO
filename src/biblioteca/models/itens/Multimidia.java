package biblioteca.models.itens;

import java.util.Scanner;
public class Multimidia extends Item{
    private formatoMultimidia formato;
    private Audio audio;
    private Video video;
    private Software software;
    public Multimidia(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, formatoMultimidia formato) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.formato = formato;
        Scanner scanner = new Scanner(System.in);
        switch(formato){
            case AUDIO:
                System.out.println("Insira a duracao: ");
                int duracao = scanner.nextInt();
                System.out.println("Insira as faixas: ");
                String listaFaixas = scanner.next();
                this.audio = new Audio(duracao, listaFaixas);
                break;
            case VIDEO:
                System.out.println("Insira a duracao: ");
                int duracaov = scanner.nextInt();
                System.out.println("Insira o elenco: ");
                String elenco = scanner.next();
                this.video = new Video(duracaov, elenco);
                break;
            case SOFTWARE:
                System.out.println("Insira a finalidade: ");
                String finalidade = scanner.next();
                System.out.println("Insira os requisitos necessários: ");
                String requisitos = scanner.next();
                System.out.println("Insira o armazenamento necessario: ");
                int armazenamento = scanner.nextInt();
                this.software = new Software(finalidade,requisitos,armazenamento);
                break;
        }
    }
    private enum formatoMultimidia{
        AUDIO,VIDEO,SOFTWARE
    }
    class Audio{
        private int duracao;
        private String listaFaixas;
        public Audio(int duracao, String listaFaixas){
            this.duracao = duracao;
            this.listaFaixas = listaFaixas;
        }
        public int getDuracao(){return duracao;}
        public void setDuracao(int duracao){this.duracao = duracao;}
        public String getListaFaixas(){return listaFaixas;}
        public void setListaFaixas(String listaFaixas){this.listaFaixas = listaFaixas;}
    }

    class Video{
        private int duracao;
        private String elenco;
        public Video(int duracao, String elenco){
            this.duracao = duracao;
            this.elenco = elenco;
        }
        public int getDuracao(){return duracao;}
        public void setDuracao(int duracao){this.duracao = duracao;}
        public String getElenco(){return elenco;}
        public void setElenco(String elenco){this.elenco = elenco;}
    }

    class Software{
        private String finalidade;
        private String requisitos;
        private int armazenamento;
        public Software(String finalidade, String requisitos,int armazenamento){
            this.finalidade = finalidade;
            this.requisitos = requisitos;
            this.armazenamento = armazenamento;
        }
    }
}