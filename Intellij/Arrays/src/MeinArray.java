public class MeinArray {

    public static boolean istGleichlang(float[] a1, float[] a2) {

        if (a1.length == a2.length)
            return true;
        else {
            return false;
        }
    }

    public static void printArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray2(float[] array) {
        for (float elem : array) {
            System.out.print(elem + " ");
        }
    }

    public static float gibElement(float[] array, int i) {
        if (i < 0 || i >= array.length) {
            return Float.MIN_VALUE;
        }
        return array[i];
    }

    public static float summiere(float[] array){
        float summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe = summe + array[i];
        }
        return summe;
        }

    }
}