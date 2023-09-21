package biblioteca.models.itens;

public class Software extends ItemMultimidiaImpl{
    private String finalidade;
    private String requisitos;
    private String armazenamento;

    public Software(int tombo, String titulo, String autor, String editora, String genero, int anoPub, String sinopse, String finalidade, String requisitos, String armazenamento) {
        super(tombo, titulo, autor, editora, genero, anoPub, sinopse);
        this.finalidade = finalidade;
        this.requisitos = requisitos;
        this.armazenamento = armazenamento;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
}
