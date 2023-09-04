package src.membro;
import src.adm.Biblioteca;

// Definição da classe Usuario que é uma subclasse de Pessoa
public class Administradores extends Funcionario {

    public Administradores(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }
    public void cadastrarPessoa(Biblioteca biblioteca,String funcao, String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        switch (funcao) {
            case "Admnistrador":
                biblioteca.getFuncionarios().add(new Administradores(nome,ra,nTelefone,endereco,dataRegistro));
            case "Atendente":
                biblioteca.getFuncionarios().add(new Gerentes(nome,ra,nTelefone,endereco,dataRegistro));
            case "Graduacao":
                biblioteca.getUsuarios().add(new EstudanteGraduacao(nome,ra,nTelefone,endereco,dataRegistro)) ;
            case "Pós":
                biblioteca.getUsuarios().add(new EstudantePosGraduacao(nome,ra,nTelefone,endereco,dataRegistro));
            case "Professor":
                biblioteca.getUsuarios().add(new Professor(nome,ra,nTelefone,endereco,dataRegistro));
        }
    }
    public void cadastrarItens(Biblioteca biblioteca) {
        cadastrar.CadastrarItens(biblioteca, "livro", "300", "teste", "fulano de tal", "editora generica", "suspense", "2023", "nao sabemos de nada do que estamos fazendo aqui", "1");
    }
    public void processarEmprestimo(Biblioteca biblioteca, Item item, Pessoa pessoa) {
        // Lógica para processar um empréstimo
        Emprestimo emprestimo = new Emprestimo(item, pessoa, pessoa.getPerfil());
        biblioteca.adicionarEmprestimo(emprestimo);
        pessoa.adicionarEmprestimo(emprestimo);
    }
    
    public void processarDevolucao(Biblioteca biblioteca, Emprestimo emprestimo) {
        // Lógica para processar a devolução
        emprestimo.devolver(biblioteca);
    }
    public void gerenciarReserva(Biblioteca biblioteca, Item item, Pessoa pessoa) {
        // Lógica para gerenciar a reserva
        biblioteca.adicionarReserva(item, pessoa);
    }
    
    
}