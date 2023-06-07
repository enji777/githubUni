public class DreieckMitStrich {
    public static void main(String[] args) {
        int height = 7;

        // obere Hälfte
        for (int i = 0; i < height / 2; i++) {
            // Sterne
            for (int j = 0; j < height - i; j++) {
                System.out.print("*");
            }
            // Striche
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        // untere Hälfte
        for (int i = height / 2; i >= 0; i--) {
            // Sterne
            for (int j = 0; j < height - i; j++) {
                System.out.print("*");
            }
            // Striche
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}