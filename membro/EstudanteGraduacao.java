package membro;

// Definição da classe EstudanteGraduacao que é uma subclasse de Usuario
public class EstudanteGraduacao extends Usuario {
    // Construtor da classe EstudanteGraduacao
    // Recebe o nome e o RA do estudante como parâmetros
    public EstudanteGraduacao(String nome, int ra) {
        super(nome, ra); // Chama o construtor da superclasse Usuario para inicializar nome e ra
        this.nivel = 1; // Define o nível do estudante de graduação como 1
    }
}
