package Exercicios05POOIndividual.Exercicio01;

public class SortUtil {

    public static <T> Object sort(Precedente<T>[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean estaOrdenado = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j].precedeA((T) arr[j + 1]) > 0) {
                    Precedente aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    estaOrdenado = false;
                }

                if (estaOrdenado)
                    break;
            }
        }

        return arr;

    }
}



