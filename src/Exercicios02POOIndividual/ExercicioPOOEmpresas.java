package Exercicios02POOIndividual;

public class ExercicioPOOEmpresas {

    public static void main(String[] args) {

    Empresa e1 = new Empresa("EmpresaX", 2021,1.13, 1.48);
    Empresa e2 = new Empresa("EmpresaY", 2021,18.4, 0.32);


    for(int i = 2021; i <= 3000; i++){
        if(e1.valor > e2.valor){
            break;
        }
        e1.CrescimentoAnual();
        e2.CrescimentoAnual();
        e1.ano ++;
        e2.ano ++;
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }


    }


    public static class Empresa{

        private String nome;

        private int ano;

        private double valor;

        private double taxaCrescimento;

        public Empresa(){

        }

        public Empresa(String nome, int ano, double valor, double taxaCrescimento) {
            this.nome = nome;
            this.ano = ano;
            this.valor = valor;
            this.taxaCrescimento = taxaCrescimento;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public double getTaxaCrescimento() {
            return taxaCrescimento;
        }

        public void setTaxaCrescimento(double taxaCrescimento) {
            this.taxaCrescimento = taxaCrescimento;
        }


        public void CrescimentoAnual(){
            double valorCrescimento = 0;
            valorCrescimento = this.valor * this.taxaCrescimento;
            this.valor = this.valor + valorCrescimento;
        }

        @Override
        public String toString() {
            return "Empresa{" +
                    "nome= '" + nome + '\'' +
                    ", ano= " + ano +
                    ", valor= " + valor +
                    ", taxaCrescimento= " + taxaCrescimento +
                    '}';
        }
    }
}

