package src.membro;
import src.Item.*;
import src.adm.Biblioteca;
import src.adm.Lista;

import java.util.Iterator;
import java.util.ArrayList;

// Definição da classe Usuario que é uma subclasse de Pessoa
public class Administradores extends Funcionario {

    public Administradores(String nome, int ra, int nTelefone, String endereco, int dataRegistro, Biblioteca biblioteca) {
        super(nome, ra, nTelefone, endereco, dataRegistro, biblioteca);
    }
    public void cadastrarPessoa(int funcao, String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        switch (funcao) {
            case 1:
                biblioteca.getFuncionarios().add(new Administradores(nome,ra,nTelefone,endereco,dataRegistro,biblioteca));
                break;
            case 2:
                biblioteca.getFuncionarios().add(new Gerentes(nome,ra,nTelefone,endereco,dataRegistro,biblioteca));
                break;
            case 3:
                biblioteca.getFuncionarios().add(new Atendentes(nome,ra,nTelefone,endereco,dataRegistro,biblioteca));
                break;
            case 4:
                biblioteca.getUsuarios().add(new EstudanteGraduacao(nome,ra,nTelefone,endereco,dataRegistro)) ;
                break;
            case 5:
                biblioteca.getUsuarios().add(new EstudantePosGraduacao(nome,ra,nTelefone,endereco,dataRegistro));
                break;
            case 6:
                biblioteca.getUsuarios().add(new Professor(nome,ra,nTelefone,endereco,dataRegistro));
                break;
        }
    }
    public void cadastrarLivro( int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int ISBN, int edicao, String localizaçao, String conservacao){
        Iterator<Lista> it = biblioteca.getListas().iterator();
        while (it.hasNext()){
            Lista i = it.next();
            if (i.getTitulo() == titulo){
                i.getLista().add(new Livro(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  ISBN,  edicao,  localizaçao,  conservacao));
            }
        }
        biblioteca.getListas().add(new Lista(titulo));
        biblioteca.getListas().get(biblioteca.getListas().size()-1).getLista().add(new Livro(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  ISBN,  edicao,  localizaçao,  conservacao));
    }
    public void cadastrarEbook(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, String formato,String link, String reqLeitura){
        Iterator<Lista> it = biblioteca.getListas().iterator();
        while (it.hasNext()){
            Lista i = it.next();
            if (i.getTitulo() == titulo){
                i.getLista().add(new Ebook(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  formato,  link,  reqLeitura));
            }
        }
        biblioteca.getListas().add(new Lista(titulo));
        biblioteca.getListas().get(biblioteca.getListas().size()-1).getLista().add(new Ebook(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  formato,  link,  reqLeitura));
    }
    public void cadastrarCD( int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, ArrayList<String> listaFaixas, int duracao, String conservacao){
        Iterator<Lista> it = biblioteca.getListas().iterator();
        while (it.hasNext()){
            Lista i = it.next();
            if (i.getTitulo() == titulo){
                i.getLista().add(new CD(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse  ,  listaFaixas,  duracao,  conservacao));
            }
        }
        biblioteca.getListas().add(new Lista(titulo));
        biblioteca.getListas().get(biblioteca.getListas().size()-1).getLista().add(new CD(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse  ,  listaFaixas,  duracao,  conservacao));
    }
    public void cadastrarDVD(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, ArrayList<String> Elenco, int duracao, String conservacao){
        Iterator<Lista> it = biblioteca.getListas().iterator();
        while (it.hasNext()){
            Lista i = it.next();
            if (i.getTitulo() == titulo){
                i.getLista().add(new DVD(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  Elenco,  duracao, conservacao));
            }
        }
        biblioteca.getListas().add(new Lista(titulo));
        biblioteca.getListas().get(biblioteca.getListas().size()-1).getLista().add(new DVD(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  Elenco,  duracao, conservacao));
    }
    public void cadastrarOutros(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, String tipoRecurso, String formato, String localizacao, String conservacao){
        Iterator<Lista> it = biblioteca.getListas().iterator();
        while (it.hasNext()){
            Lista i = it.next();
            if (i.getTitulo() == titulo){
                i.getLista().add(new Outros(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  tipoRecurso,  formato,  localizacao,  conservacao));
            }
        }
        biblioteca.getListas().add(new Lista(titulo));
        biblioteca.getListas().get(biblioteca.getListas().size()-1).getLista().add(new Outros(tombo,  titulo,  autor,  editora,  genero,  anoPub,  sinopse,  tipoRecurso,  formato,  localizacao,  conservacao));
    }
}