package src.membro;

// Definição da classe EstudantePosGraduacao que é uma subclasse de Usuario
public class EstudantePosGraduacao extends Usuario {
    // Construtor da classe EstudantePosGraduacao
    // Recebe o nome e o RA do estudante como parâmetros
    public EstudantePosGraduacao(String nome, int ra) {
        super(nome, ra); // Chama o construtor da superclasse Usuario para inicializar nome e ra
        this.nivel = 2; // Define o nível do estudante de pós-graduação como 2
    }
}
