package Exercicios01POOGrupo;

import java.util.Scanner;

public class ExercicioPOONumerosPrimos2 {

    public static void main(String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);
        int n = numeroDigitado.nextInt();
        int valor = 0;

        System.out.println("Resultado de números primos a partir de: " + n);
        System.out.println("---------------------------------------------");

        while (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    valor++;
                    //i++;

                }

            }

            if (valor == 2) {
                System.out.println(n);

            } else {

            }
            valor = 0;
            n = n - 1;
        }
    }
}

