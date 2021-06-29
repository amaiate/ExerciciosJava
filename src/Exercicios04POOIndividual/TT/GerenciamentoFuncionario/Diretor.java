package Exercicios04POOIndividual.TT.GerenciamentoFuncionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Diretor extends Funcionario {

    public Diretor(String nome, BigDecimal lucro) {
        super(nome);
        super.setTipo(Tipo.CLT);
        super.setSalario(new BigDecimal(15000));
        this.setLucrosEmpresa(lucro);

        this.setValorHora(this.getSalario().divide(new BigDecimal(22), RoundingMode.HALF_EVEN));
        this.setPercentualBonificacao(new BigDecimal(0.03).setScale(2, RoundingMode.HALF_EVEN));
    }
    public void pagaSalario(){

        this.setSalario(this.getSalario().add(this.getPercentualBonificacao().multiply(this.getLucrosEmpresa())).setScale(2, RoundingMode.HALF_EVEN));

    }

    /* Diretores não possuem bonificação, entretanto recebem participação nos lucros de 3%,
    não possuem horário de trabalho definido e seu salário base é de R$ 15.000.
     */
}
