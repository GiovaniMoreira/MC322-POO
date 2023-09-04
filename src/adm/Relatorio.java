package src.adm;
//pega os dados da biblioteca e junta tudo. n de emprestimos, livros e multas
import src.Item.Item;
import src.membro.Pessoa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Relatorio {
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Lista> items;
    private int multas;

    public Relatorio(Biblioteca biblioteca) { //O emprestimo depende do momento biblioteca  e não existe sem ela
        this.emprestimos = biblioteca.getEmprestimos();
        this.items = biblioteca.getListas();
        this.multas = biblioteca.getMultas();
    }

    //Gerador de relatorio
    public void gerarRelatorio() {
        int numeroEmprestimos = emprestimos.size();
        int numeroLivros = items.size();
        String url = "files/relatorio.csv";

        try {
            FileWriter writer = new FileWriter(url);
            writer.write("Relatório da Biblioteca:\n");
            writer.write("Número de Empréstimos: " + numeroEmprestimos + "\n");
            writer.write("Número de Livros: " + numeroLivros + "\n");
            writer.write("Número de Multas: " + multas + "\n");
            writer.write("O relatório foi gerado com sucesso!");
            writer.close();
            System.out.println("Relatório gerado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gerarRelatóriItens(Biblioteca biblioteca){
        Iterator<Lista> iterator = biblioteca.getListas().iterator();
        while (iterator.hasNext()){
            Lista i = iterator.next();
            Iterator<Item> itLivro = i.getLista().iterator();
            int buffer1 = 0;
            int buffer2 = 0;
            while (itLivro.hasNext()){
                Item j = itLivro.next();
                buffer1 += j.getnEmprestimos();
                buffer2 += j.getnReservas();
            }
            System.out.println("Livro: " + i.getTitulo()+"\nEmprestimos: "+buffer1+"\nReservas: "+buffer2);
        }
    }

    private static class AtividadeMembro {
        private int emprestimos;
        private int devolucoes;
        private int multas;

        public void incrementarEmprestimos() {
            emprestimos++;
        }

        public void incrementarDevolucoes() {
            devolucoes++;
        }

        public void incrementarMultas() {
            multas++;
        }
    }

     public void gerarRelatorioAtividadesMembros(Biblioteca biblioteca, LocalDate inicio, LocalDate fim) {
        // mapa para rastrear atividades de membros
        Map<Pessoa, AtividadeMembro> atividades = new HashMap<>();

        // mapa com atividades de empréstimo, devolução e multas
        for (Emprestimo emprestimo : emprestimos) {
            LocalDate dataEmprestimo = emprestimo.getDataEmprestimo();
            if (dataEmprestimo.isAfter(inicio) && dataEmprestimo.isBefore(fim)) {
                Pessoa pessoa = emprestimo.getPessoa();
                atividades.putIfAbsent(pessoa, new AtividadeMembro());
                AtividadeMembro atividade = atividades.get(pessoa);
                atividade.incrementarEmprestimos();
            }
        }
        
    }

    private static class UsoItemMultimidia {
        private int emprestimos;
        private int reservas;

        public void incrementarEmprestimos(int quantidade) {
            emprestimos += quantidade;
        }

        public void incrementarReservas(int quantidade) {
            reservas += quantidade;
        }
    }
}

     // Gerar relatório de uso de itens multimídia
     public void gerarRelatorioUsoItensMultimidia(Biblioteca biblioteca) {
        // Crie um mapa para rastrear o uso de itens multimídia
        Map<String, UsoItemMultimidia> usoItens = new HashMap<>();

        // Preencha o mapa com informações de empréstimo e reserva
        for (Lista lista : items) {
            for (Item item : lista.getLista()) {
                String tipoItem = item.getTipo();
                usoItens.putIfAbsent(tipoItem, new UsoItemMultimidia());
                UsoItemMultimidia usoItem = usoItens.get(tipoItem);
                usoItem.incrementarEmprestimos(item.getnEmprestimos());
                usoItem.incrementarReservas(item.getnReservas());
            }
        }
    }

}


