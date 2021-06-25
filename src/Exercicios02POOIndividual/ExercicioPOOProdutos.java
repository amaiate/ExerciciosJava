package Exercicios02POOIndividual;

import java.util.Scanner;

public class ExercicioPOOProdutos {
    public static void main(String[] args){
        Scanner digitado = new Scanner(System.in);

        System.out.println("Insira os dados do Produto 1: ");
        System.out.println("Nome: ");
        String nomeProd1 = digitado.next();
        System.out.println("Preço: ");
        double precoProd1 = digitado.nextDouble();
        System.out.println("Quantidade: ");
        int quantidadeProd1 = digitado.nextInt();

        System.out.println("Insira os dados do Produto 2: ");
        System.out.println("Nome: ");
        String nomeProd2 = digitado.next();
        System.out.println("Preço: ");
        double precoProd2 = digitado.nextDouble();
        System.out.println("Quantidade: ");
        int quantidadeProd2 = digitado.nextInt();

        System.out.println("Insira os dados do Produto 3: ");
        System.out.println("Nome: ");
        String nomeProd3 = digitado.next();
        System.out.println("Preço: ");
        double precoProd3 = digitado.nextDouble();
        System.out.println("Quantidade: ");
        int quantidadeProd3 = digitado.nextInt();

        double valorTotal = (quantidadeProd1*precoProd1) + (quantidadeProd2*precoProd2) + (quantidadeProd3*precoProd3);

        System.out.println("Produto 1: " );
        System.out.println(nomeProd1);
        System.out.println("R$ " + precoProd1);
        System.out.println("Quantidade: " + quantidadeProd1);
        System.out.println("--------------------------------------------------------------" );
        System.out.println("Produto 2: " );
        System.out.println(nomeProd2);
        System.out.println("R$ " + precoProd2);
        System.out.println("Quantidade: " + quantidadeProd2);
        System.out.println("--------------------------------------------------------------" );
        System.out.println("Produto 3: " );
        System.out.println(nomeProd3);
        System.out.println("R$ " + precoProd3);
        System.out.println("Quantidade: " + quantidadeProd3);

        System.out.println("Valor Total R$: " + valorTotal);
    }
}
