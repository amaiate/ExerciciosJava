package Exercicios04POOIndividual.TT.GerenciamentoFuncionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Analista extends Funcionario{

    public Analista(String nome, boolean meta) {
        super(nome);
        super.setTipo(Tipo.CLT);
        super.setSalario(new BigDecimal(4000));
        this.setHorasTrabalhadas(new BigDecimal(40));
        this.setMetaBatida(meta);
        this.setValorHora(this.getSalario().divide(new BigDecimal(22), RoundingMode.HALF_EVEN));
        this.setPercentualBonificacao(new BigDecimal(0.08).setScale(2, RoundingMode.HALF_EVEN));
    }

    public void pagaSalario(){
        if (this.getMetaBatida() == true){
            super.bonificacaoPagar();
            this.setSalario(this.getSalario().add(this.getBonificacao()).setScale(2, RoundingMode.HALF_EVEN));
        }
    }
}
