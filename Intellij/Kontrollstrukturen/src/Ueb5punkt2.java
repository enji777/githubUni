public class Ueb5punkt2 {
    public static int multipliziere(int x, int y) {
        int produkt = 0;
        for (int i = 0; i < y; i++) {
            produkt = produkt + x;
        }
        return produkt;
    }


    public static void main(String[] args) {
        System.out.print(multipliziere(5, 11));
    }
}
