public class summenbildung {

    public static int summiereIterativ(int eingabe) {

        int n = 0;
        for (int i = 0; i <= eingabe; i++) {
            n = n + i;
        }
        return n;
    }


    public static int summiereRekursiv(int eingabe) {
        int n = eingabe;
        if (eingabe == 0) return 0;
        else
            return n + summiereRekursiv(n-1);
    }

    public static void main(String[] args) {
        System.out.println(summiereIterativ(7));
        System.out.println(summiereRekursiv(7));
    }

}
