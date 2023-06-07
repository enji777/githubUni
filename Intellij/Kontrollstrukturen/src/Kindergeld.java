public class Kindergeld {
    public static void main(String[] args) {
        int anzahlKinder = 1;
        int kindergeld;
        switch (anzahlKinder) {
            case 0: kindergeld = 0;
            case 1: kindergeld = 1000;
            case 2: kindergeld = 2200;
            default: kindergeld = anzahlKinder * 1500;
        }
        System.out.println("Kindergeld beträgt " + kindergeld + " EUR.");
    }

}
