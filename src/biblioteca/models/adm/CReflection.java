package biblioteca.models.adm;

import java.lang.reflect.*;
import java.util.ArrayList;

public class CReflection {

    public CReflection(){}

    public void getMethods(Class classe){
        System.out.println();
        Method[] metodos = classe.getDeclaredMethods();
        for (Method metodo: metodos){
            System.out.println(metodo.getName());
        }
        System.out.println();
    }

    public void getAtributos(Class classe){
        System.out.println();
        Field[] atributos = classe.getDeclaredFields();
        for (Field atributo: atributos){
            System.out.println(atributo.getName());
        }
        System.out.println();
    }

    public void inspecionar(int i, Class classe){
        switch (i){
            case(1):
                getMethods(classe);
                break;
            case 2:
                getAtributos(classe);
                break;
        }
    }
}
