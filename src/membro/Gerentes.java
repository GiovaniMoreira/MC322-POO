package src.membro;

// Importações de classes externas
import src.adm.Emprestimo;
import src.Item.*; // Importa classes do pacote Item
import src.adm.Biblioteca;
import src.adm.Relatorio;
import src.adm.ConfiguracaoSistema;
import java.util.ArrayList;

// Definição da classe Usuario que é uma subclasse de Pessoa
public class Gerentes extends Funcionario {
    public Gerentes(String nome, int ra, int nTelefone, String endereco, int dataRegistro ) {
        super(nome, ra, nTelefone, endereco, dataRegistro);

    }
    // Acessar relatórios e estatísticas avançadas
    public void acessarRelatoriosEstatisticas(Biblioteca biblioteca) {
        Relatorio relatorio = new Relatorio(biblioteca);
    // Chame métodos de relatório específicos para acessar informações avançadas
        relatorio.gerarRelatorio();
        relatorio.gerarRelatorioItens(biblioteca);
    // Implemente lógica adicional para outros relatórios e estatísticas avançadas
    }
     // Ajustar configurações específicas do sistema
     public void ajustarConfiguracoesSistema(ConfiguracaoSistema configuracao, int novoPrazo, double novaMulta, int novoLimite) {
        // Ajuste as configurações do sistema conforme necessário
        configuracao.setPrazoEmprestimo(novoPrazo);
        configuracao.setMultaPorAtraso(novaMulta);
        configuracao.setLimiteEmprestimo(novoLimite);
        // Implemente lógica adicional para outras configurações específicas do sistema
    }


}