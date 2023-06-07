public class DreieckMitStrich {
    public static void main(String[] args) {


        for (int i = 1; i <= 7; i++) {
            for (int l = 7; l >= i; l--) {
                if (i == 3) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}