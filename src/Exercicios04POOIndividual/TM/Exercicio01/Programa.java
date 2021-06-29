package Exercicios04POOIndividual.TM.Exercicio01;

public class Programa {

    public static void main(String[] args) {

         /* Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência.
    A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente
    da qual copiará todos os seus dados. Além disso, os métodos de acesso devem ser desenvolvidos para
    cada variável de instância da classe, desenvolvendo um método set e outro método get.
    Por exemplo: se a classe tem uma variável double saldo, seus métodos de acesso serão:
    double getSaldo () e void setSaldo (double s) Os protótipos dos métodos e construtores devem ser
    discutidos e projetados em equipe.
     */

        ContaCorrente c1 = new ContaCorrente(2435, 100, 10 );
        ContaCorrente c2 = new ContaCorrente(5465, 300, 0);


        System.out.println("--------------Inicio conta c1 e c2----------------------");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("--------------C1 Depositando 50 reais-------------------");

        c1.Deposito(50);
        System.out.println(c1.toString());

        System.out.println("--------------C1 Sacando 150 reais-----------------------");
        c1.Saque(150);
        System.out.println(c1.toString());

        System.out.println("--------------C1 Sacando 50 reais, acima do saldo--------");
        c1.Saque(50);
        System.out.println(c1.toString());

        System.out.println("--------------C2 Transfere 100 reais para o C1------------");
        c2.Transferencia(c1,100);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("--------------C2 Transfere 1150 reais para o C1------------");
        c2.Transferencia(c1,1150);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("--------------C2 Devolve 100 reais para o C1------------");
        c2.Devolucao(c1,100);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("--------------C2 Devolve 1000 reais para o C1------------");
        c2.Devolucao(c1,1000);
        System.out.println(c1.toString());
        System.out.println(c2.toString());


    }



}
