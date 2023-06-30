public class arraysVerketten {
    public static int verkette(int[] a, int[] b){



    }

    public static int[] kopiere( int[] original,int neueLaenge){
        int[] kopie = new int[neueLaenge];
        if(original.length <= neueLaenge){
        for(int i = 0; i < original.length; i++)
            kopie[i] = original[i];
    }
        else{
            for(int i = 0; i < neueLaenge; i++)
                kopie[i] =original[i];
        }
        return kopie;
}
