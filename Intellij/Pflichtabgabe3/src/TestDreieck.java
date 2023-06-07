// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestDreieck {
    public static void main(String[] args) {

        Dreieck d1 = new Dreieck(0);
        d1.setSeite(7);

        Dreieck d2 = new Dreieck(3.2);

        System.out.println(d1.berechneFlaeche());

        d1.skaliereDreieck(1.5);
        System.out.println(d1.berechneFlaeche());

        System.out.println(d1.getSeite());

        System.out.println(d2.berechneHoehe());

        System.out.println(d1.vergleicheDreieck(d2));
    }
}