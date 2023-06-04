public class fakultaet {
    public static int fakultaet(int eingabe) {
        if (eingabe <= 1) return 1;
        else
            return eingabe * fakultaet(eingabe - 1);
    }

    public static void main(String[] args) {
        int erg = fakultaet(5);
        System.out.println(erg);
    }
}
