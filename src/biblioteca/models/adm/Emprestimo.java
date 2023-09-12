package biblioteca.models.adm;

import biblioteca.models.itens.Emprestavel;
import biblioteca.models.membro.Membro;

public class Emprestimo {
    private int idMembro;
    private int idItem;
    private int dataEmprestimo;
    private int dataDevolucao;
    public Emprestimo(Membro membro, Emprestavel emprestavel, int data){
        this.idMembro = membro.getRa();
        this.idItem = emprestavel.getTombo();
        this.dataEmprestimo = data;
        this.dataDevolucao = data + 7;
    }
}
