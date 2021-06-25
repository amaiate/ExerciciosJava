package Exercicios02POOIndividual;

import java.util.Arrays;
import java.util.Collections;

public class ExercicioPOOArray {

    public static void main(String[] args) {

        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(array, 0,10);

        System.out.println("Números em ordem crescente são: ");

        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------------------");
        System.out.println("Números em ordem decrescente são: ");

        int[] arrDesc = Arrays.stream(array)
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arrDesc));


    }
}
