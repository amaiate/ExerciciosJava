package Exercicios01POOGrupo;

import java.util.Scanner;

public class ExercicioPOONumerosPares {

    public static void main (String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);
        int comando = numeroDigitado.nextInt();

        System.out.println("São números pares: ");
        System.out.println("--------------------");

        for (int i = 0; i <= comando; i++){
            if (comando % 2 == 0){
                System.out.println("Número: " + i);
                i ++;
            }

        }

    }

}
