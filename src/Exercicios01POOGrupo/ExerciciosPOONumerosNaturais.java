package Exercicios01POOGrupo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPOONumerosNaturais {

    public static void main (String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);
        int n = numeroDigitado.nextInt();
        int m = numeroDigitado.nextInt();
        int d = numeroDigitado.nextInt();

        System.out.println("Os " + n + " números naturais são:");
        System.out.println("----------------------------------");
        int lastAmostra = 0;
        int contadorD = 0;
        List<String> listaN = new ArrayList<>();
        String candidatoN = "";
        String stringC = "";

        for (int i = 1; i <= n; i++){

            for (int j = lastAmostra + 1; j <= 1000; j++) {

                candidatoN = Integer.toString(j);
                char[] candidatoChar = candidatoN.toCharArray();
                contadorD = 0;

                for (char c : candidatoChar
                     ) {
                    stringC = Character.toString(c);
                    if (stringC.equals(Integer.toString(d))){
                        contadorD++;
                    }

                }

                if (contadorD == m){
                    listaN.add(candidatoN);
                    lastAmostra = j;
                    break;
                }

            }

        }
        System.out.println(listaN.toString());

    }
}
