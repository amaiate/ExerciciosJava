package Exercicios01POOGrupo;

import java.util.Scanner;

public class ExercicioPOONumerosPrimos {

    public static void main (String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);
        int n = numeroDigitado.nextInt();
        int valor = 0;

        System.out.println("Resultado se " + n + " é primo:");
        System.out.println("-------------------------------");

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                valor ++;
                i ++;

            }
        }

        if(valor == 2){
            System.out.println("Esse número é primo");

        }else{
            System.out.println("Esse número não é primo");

        }


    }
}
