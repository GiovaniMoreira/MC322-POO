package src.membro;

// Definição da classe Professor que é uma subclasse de Usuario
public class Professor extends Usuario {
    
    // Construtor da classe Professor
    // Recebe o nome e o RA do professor como parâmetros
    public Professor(String nome, int ra) {
        super(nome, ra); // Chama o construtor da superclasse Usuario para inicializar nome e ra
        this.nivel = 3;  // Define o nível do professor como 3
    }
}
