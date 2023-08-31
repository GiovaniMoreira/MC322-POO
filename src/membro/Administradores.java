package src.membro;
import src.Item.Livro;
import src.adm.Biblioteca;
import src.adm.Lista;

import java.util.Iterator;
import java.util.ArrayList;

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
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + funcao);
        }
    }
    public void castrarLivro(Biblioteca biblioteca, int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int totalCopias, int ISBN, int edicao, String localizaçao, String conservacao){
        Iterator<Lista> it = biblioteca.getListas().iterator();
        while (it.hasNext()){
            Lista i = it.next();
            if (i.getTitulo() == titulo){
                i.getLista().add(new Livro(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  totalCopias,  ISBN,  edicao,  localizaçao,  conservacao));
            }
        }
        biblioteca.getListas().add(new Lista(titulo));
        biblioteca.getListas().get(biblioteca.getListas().size()-1).getLista().add(new Livro(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  totalCopias,  ISBN,  edicao,  localizaçao,  conservacao));
    }
}