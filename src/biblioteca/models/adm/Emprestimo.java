package biblioteca.models.adm;

import biblioteca.models.itens.ItemMultimidia;
import biblioteca.models.membro.Membro;

public class Emprestimo<M extends Membro ,I extends ItemMultimidia> {
    private M idMembro;
    private I idItem;
    private int dataEmprestimo;
    private int dataDevolucao;
    private int idEmprestimo;

    public Emprestimo(M membro, I itemMultimidia, int data, int idEmprestimo ){
        this.idMembro = membro;
        this.idItem = itemMultimidia;
        this.dataEmprestimo = data;
        this.dataDevolucao = data + membro.getPrazoEmprestimos();
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdEmprestimo(){
        return idEmprestimo;
    }
}
