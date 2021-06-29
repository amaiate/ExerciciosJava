package Exercicios04POOIndividual.TT.GerenciamentoFuncionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {

    private String nome;

    private Tipo tipo;

    private BigDecimal horasTrabalhadas;

    private BigDecimal valorHora;

    private BigDecimal salario;

    private BigDecimal bonificacao;

    private BigDecimal percentualBonificacao;

    private boolean metaBatida;

    private BigDecimal lucrosEmpresa;

    public Funcionario(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(BigDecimal bonificacao) {
        this.bonificacao = bonificacao;
    }

    public BigDecimal getPercentualBonificacao() {
        return percentualBonificacao;
    }

    public void setPercentualBonificacao(BigDecimal percentualBonificacao) {
        this.percentualBonificacao = percentualBonificacao;
    }

    public BigDecimal getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(BigDecimal horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    public boolean getMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }

    public BigDecimal getLucrosEmpresa() {
        return lucrosEmpresa;
    }

    public void setLucrosEmpresa(BigDecimal lucrosEmpresa) {
        this.lucrosEmpresa = lucrosEmpresa;
    }

    public void pagaSalario(){

    }

    public void participacaoLucros(){

    }

    public void bonificacaoPagar(){
        this.bonificacao = this.salario.multiply(this.percentualBonificacao).setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {

        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", salario=" + salario +
                ", bonificacao=" + bonificacao +
                ", percentualBonificacao=" + percentualBonificacao +
                ", metaBatida=" + metaBatida +
                ", lucrosEmpresa=" + lucrosEmpresa +
                '}';
    }
}
