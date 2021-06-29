package Exercicios04POOIndividual.TT.GerenciamentoFuncionario;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Tecnico("Adriana", false);
        Funcionario p1 = new Prestador("Victor", new BigDecimal(20), new BigDecimal(40));
        Funcionario f2 = new Analista("Estela", true);
        Funcionario g1 = new Gerente("Diego", true);
        Funcionario d1 = new Diretor("Ana", new BigDecimal(10000));

        f1.pagaSalario();
        p1.pagaSalario();
        f2.pagaSalario();
        g1.pagaSalario();
        d1.pagaSalario();

        System.out.println(f1);
        System.out.println(p1);
        System.out.println(f2);
        System.out.println(g1);
        System.out.println(d1);
    }

}
