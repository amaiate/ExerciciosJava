package Exercicios04POOIndividual.TT.GerenciamentoFuncionario;

import java.math.BigDecimal;

public class Prestador extends Funcionario{

    public Prestador(String nome, BigDecimal valorHora, BigDecimal horasTrabalhadas){
        super(nome);
        super.setTipo(Tipo.PJ);
        this.setHorasTrabalhadas(horasTrabalhadas);
        this.setValorHora(valorHora);
    }

    public void pagaSalario(){
        this.setSalario(this.getHorasTrabalhadas().multiply(this.getValorHora()));
    }

}
