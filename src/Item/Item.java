package src.Item;

import src.adm.Biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public abstract class Item {
    protected String item;
    protected int tombo;
    protected String titulo;
    protected String autor;
    protected String editora;
    protected String genero;
    protected int anoPub; //em livros sera usado como fisico/digital, em midias para cd/dvd
    protected String sinopse;
    protected int totalCopias;
    protected int copiasDisponiveis;
    private int nEmprestimos;
    private int nReservas;
    private boolean disponibilidade = true;
    public Item(String item, int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int totalCopias){
        this.item = item;
        this.tombo = tombo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.anoPub = anoPub;
        this.totalCopias = totalCopias;
        this.copiasDisponiveis = totalCopias;

    }

    //Getters e setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }   

    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getAutor() {
        return autor;
    }

    public int getAnoPub(){
        return anoPub;
    }
    public void setAnoPub(int anoPub){
        this.anoPub = anoPub;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public int getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(int totalCopias) {
        this.totalCopias = totalCopias;
    }

    public int getnEmprestimos() {
        return nEmprestimos;
    }

    public void setnEmprestimos(int nEmprestimos) {
        this.nEmprestimos = nEmprestimos;
    }

    public int getnReservas() {
        return nReservas;
    }

    public void setnReservas(int nReservas) {
        this.nReservas = nReservas;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    //metodos
    public void CadastrarItens(String item; int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, int totalCopias, String url){
        CriarArquivo(url);
        try {
            List<String> existentes = LinhasExistentes(url);
            String linha = item ";" + tombo ";"+ titulo ";"+ autor ";"+ editora ";"+ genero ";"+ anoPub ";"+ sinopse ";"+ totalCopias";";
            existentes.add(linha);
            String todasLinhas = unicaLinha(existentes);
            FileWriter arquivo = new FileWriter(url);
            arquivo.write(todasLinhas);
            arquivo.close();
            
        } catch (Exception error) {
            System.out.println(x: "Erro ao criar Relatório " + url)
        }
    }  
    public void String UnicaLinha(List<String> existentes){
        String unicaLinha = "";
        for (String linha : existentes){
            unicaLinha += linha + " \n";
        }
        return unicaLinha;
    }
    public void CriarArquivo(String url){
        try {
            File arquivo = new File(url);
            arquivo.createNewFile();
        } catch (Exception error) {
            System.out.println(x: "Erro ao criar Relatório ")
        }
    }
    public List<String> LinhasExistentes(String url){
        try {
            Path path = Phats.get(url); 
            result = File.readAllLines(path)
        } catch (Exception e) {
            System.out.println(x: "Erro ao criar Relatório ")
        }
        List<String> result = new ArrayList<String>();
        return result;
  
    }

}

