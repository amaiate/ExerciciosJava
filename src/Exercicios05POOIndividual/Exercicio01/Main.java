package Exercicios05POOIndividual.Exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("adriana", "876.098.465.64");
        Pessoa p1 = new Pessoa("victor", "676.098.465.64");
        Pessoa p2 = new Pessoa("estela", "876.098.876.64");

        Pessoa[] pessoas = {p1, p, p2};



       pessoas = (Pessoa[]) SortUtil.sort(pessoas);

        for (Pessoa pes : pessoas
             ) {
            System.out.println(pes.getNome());
        }




    }
}
