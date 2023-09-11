package biblioteca.models.membro;

import src.Item.*;
import src.adm.Biblioteca;
import src.adm.Lista;

import java.util.Iterator;
import java.util.ArrayList;


public class Administradores extends Funcionario {

    public Administradores(String nome, int ra, int nTelefone, String endereco, int dataRegistro) {
        super(nome, ra, nTelefone, endereco, dataRegistro);
    }
}