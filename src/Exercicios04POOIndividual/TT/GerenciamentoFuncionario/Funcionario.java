package Exercicios04POOIndividual.TT.GerenciamentoFuncionario;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;

    private Tipo tipo;

    private BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
