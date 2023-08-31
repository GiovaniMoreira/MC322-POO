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
}