public class Schachbrett2 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0)
                for (int j = 0; j < 9; j++) {

                    if (j % 2 == 0)
                        System.out.print("*");
                    else System.out.print(".");
                }
            else
                for (int j = 0; j < 9; j++) {
                    if (j % 2 == 0)
                        System.out.print(".");
                    else System.out.print("*");
                }
            System.out.println();

        }
    }
}
