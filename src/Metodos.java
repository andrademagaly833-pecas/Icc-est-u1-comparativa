
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Metodos {

    // ORDENAMIENTO BURBUJA
    public void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    swap = true;
                }
            }

            if (!swap) {
                return;
            }
        }
    }

    // QUICKSORT
    public void sortQuick(int[] arr) {
        if (arr.length > 1) {
            quickSort(arr, 0, arr.length - 1);
        }
    }

    private void quickSort(int[] arr, int inicio, int fin) {
        int i = inicio;
        int j = fin;
        int pivote = arr[inicio + (fin - inicio) / 2];

        while (i <= j) {
            while (arr[i] < pivote) i++;
            while (arr[j] > pivote) j--;

            if (i <= j) {
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
                i++;
                j--;
            }
        }

        if (inicio < j) quickSort(arr, inicio, j);
        if (i < fin) quickSort(arr, i, fin);
    }

    // COLLECTORS
    public void sortCollectors(int[] arr) {
        List<Integer> lista = Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = lista.get(i);
        }
    }

    // COLLECTORS V2
    public void sortCollectorsV2(int[] arr) {
        List<Integer> lista = Arrays.stream(arr)
                .parallel()
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = lista.get(i);
        }
    }
}
