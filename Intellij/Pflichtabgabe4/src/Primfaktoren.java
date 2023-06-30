
public class Primfaktoren {


    public static int[] primeFactorize(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Der gegebene Parameter ist zu klein!");
        }
        int[] array = new int[number];
        int counter = 0;
        int factor = 2;
        while (factor*factor <= number) {
            if (number % factor == 0) {
                array[counter] = factor;
                counter++;
                number = number / factor;
            }
            else {
                factor++;
            }
        }
        array[counter] = number;

        int[] newArray = new int[counter+1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
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
