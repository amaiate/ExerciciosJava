package Exercicios01POOGrupo;

import java.util.Scanner;

public class ExercicioPOOMultiplos {

    public static void main (String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);
        int n = numeroDigitado.nextInt();
        int m = numeroDigitado.nextInt();

        System.out.println("Os múltiplos de " + m + " são:");
        System.out.println("------------------------------");

        for (int i = 0; i <= n; i++){
            if (m % n == 0){
                System.out.println("Múltiplo: " + i);
                i ++;
            }

        }

    }
}
