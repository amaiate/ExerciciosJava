package Exercicios04POOIndividual.Exercicio01;

public class ContaCorrente {

    private int numero;

    private double saldo;

    private double limite;

    public ContaCorrente(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public ContaCorrente() {

    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void Deposito (double valor){
        this.saldo = saldo + valor;
    }

    public void Saque (double valor){

        if(valor <= saldo){
        this.saldo = saldo - valor;
        }else{
        System.out.println("Saldo insuficiente");
        }

    }

    public void Devolucao (ContaCorrente contaDestino, double valor){

        if(valor <= saldo){
            this.saldo = saldo - valor;
            contaDestino.Deposito(valor);
        }else{
        System.out.println("Saldo insuficiente para devolução!");
        }

    }

    public void Transferencia(ContaCorrente contaDestino, double valor){

        if(valor <= saldo){
            this.saldo = saldo - valor;
            contaDestino.Deposito(valor);
        }else{
        System.out.println("Saldo insuficiente para transferência!");
        }

    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
