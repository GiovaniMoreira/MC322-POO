package src.adm;import src.Item.*;import src.membro.*; import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    protected final Item item; //Para cada Emprestimo são associados um item e um usuário, porem o mesmo usuario pode ter varios emprestimos
    protected final Pessoa pessoa;
    private PerfilMembro perfil;

    //Construtor
    public Emprestimo(Item item, Pessoa pessoa, PerfilMembro perfil) {
        this.dataEmprestimo = LocalDate.now();//Biblioteca.getData();
        this.item = item;
        this.pessoa = pessoa;
        this.perfil = perfil;
    }

    //Getters e Setters
    public  LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(  LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public  LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(  LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Pessoa getPessoa(){
        return pessoa;
    }

    public Item getItem(){
        return item;
    }

    public int getPrazoEmprestimo() {
        switch (perfil) {
            case EstudanteGraduacao:
                return 15;
            case EstudantePosGraduacao:
                return 20;
            case Professor:
                return 30;
            case Funcionario:
                return 20;
            default:
                return 0;
        }
    }

    public int getLimiteEmprestimo() {
        switch (perfil) {
            case EstudanteGraduacao:
                return 3;
            case EstudantePosGraduacao:
                return 5;
            case Professor:
                return 7;
            case Funcionario:
                return 4;
            default:
                return 0; // Perfil desconhecido
        }
    }

    public double getMulta() {
        switch (perfil) {
            case EstudanteGraduacao:
                return 1.00;
            case EstudantePosGraduacao:
                return 1.00;
            case Professor:
                return 0.50;
            case Funcionario:
                return 0.75;
            default:
                return 0.00;
        }
    }



    private boolean itemEstaReservado() {
        // Implemente a verificação de reservas aqui
        // Verifique se a cópia do item está reservada por outro membro
        return false; // Implemente a lógica real de reserva
    }

    public void devolver(Biblioteca biblioteca){
        int data = LocalDate.now();
        if (data > this.dataDevolucao){
            double multa = this.pessoa.getValorMulta();
            this.pessoa.setValorMulta(multa + (data-dataDevolucao)*3);
            biblioteca.setMultas(biblioteca.getMultas()+1);
        }
        biblioteca.getEmprestimos().remove(0);
        pessoa.getEmprestimos().remove(0);
    }

}
