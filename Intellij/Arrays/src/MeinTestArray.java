public class MeinTestArray {
    public static void main(String[] args) {
        float[] array1 = {1.0f, 2.0f, 3.0f};
        float[] array2 = {4.0f, 5.0f};
        int[] array3 = {2,12,22};
        int [] array4 ={33,300,3};

        System.out.println(MeinArray.istGleichlang(array1,array2));

        MeinArray.printArray(array1);
        MeinArray.printArray2(array1);
        System.out.println();
        System.out.println(MeinArray.gibElement(array1, 1));
        System.out.println(MeinArray.gibElement(array1, 3));
        System.out.println(MeinArray.gibElement(array1, -5));

        System.out.println(MeinArray.summiere(array1));

    }

}

