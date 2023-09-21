package biblioteca.models.adm;

import biblioteca.models.itens.ItemMultimidia;
import biblioteca.models.membro.Membro;

public class Emprestimo {
    private int idMembro;
    private int idItem;
    private int dataEmprestimo;
    private int dataDevolucao;
    private int idEmprestimo;
    
    public Emprestimo(Membro membro, ItemMultimidia itemMultimidia, int data, int idEmprestimo ){
        this.idMembro = membro.getRa();
        this.idItem = itemMultimidia.getTombo();
        this.dataEmprestimo = data;
        this.dataDevolucao = data + membro.getPrazoEmprestimos();
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdEmprestimo(){
        return idEmprestimo;
    }

}
