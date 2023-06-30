import.util.ArrayList;
import.java.util.List;

public class Primfaktoren {
//public static int[] primeFactorize(int number) {
        if (number < 2) {
        throw new IllegalArgumentException("Der gegebene Parameter ist zu klein!");
    }
}

    public static int[] bubblesort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
