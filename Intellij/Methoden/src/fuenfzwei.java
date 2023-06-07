public class fuenfzwei {

    public static int multipliziere(int x, int y) {
        int produkt = 0;
        int factor = 1;

        if (x < 0){
            factor = -factor;
            x = -x;
        }
        if (y < 0){
            factor = -1;
            y = -y;
        }

        for (int i = 0; i < y; i++) {
            produkt = produkt + x;
        }
        return produkt * factor;
    }


    public static void main(String[] args) {
        System.out.println(multipliziere(5, -6));
    }
}
