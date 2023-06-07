public class TeilerVielfaches {

    // Berechnet den größten gemeinsamen Teiler zweier natürlicher Zahlen rekursiv
    public static int ggTrekursiv(int x, int y) {
        // Abbruchbedingung
        if (y == 0) {
            return x;
        }
        else {
            // Siehe Tipp  "Mathematisch ist ggT(x, y) = ggT(y, x mod y)"
            return ggTrekursiv(y, (x % y));
        }

    }

    // Berechnet das kleinste gemeinsame Vielfache zweier natürlicher Zahlen mit Nutzung von ggTrekursiv
    public static int kgV(int a, int b) {

        // Aufruf von Methode ggTrekursiv,
        int ggT = ggTrekursiv(a, b);

        // Berechnung und Rückgabe kgV mit formel kgV(m,n) = m * n / ggT(m,n)
        // Quelle für Formel: https://de.wikipedia.org/wiki/Kleinstes_gemeinsames_Vielfaches#Berechnung_%C3%BCber_den_gr%C3%B6%C3%9Ften_gemeinsamen_Teiler_(ggT)
        return (a * b) / ggT;

    }


    // Ermittelt im Loop Intervall(x, y) alle Zahlenpaare, dessen ggT größer als z sind
    public static void gibZahlenpaareAus(int x, int y, int z) {

        // Äußere Schleife für erste Zahl im Paar
        for (int i = x; i <= y; i++) {
            // Innere Schleife für zweite Zahl im Paar
            for (int j = x; j <= y; j++) {
                // Prüft ob Zahlen ungleich sind
                if (i != j) {
                    // Prüft ob ggT > z
                    int ggT = ggTrekursiv(i, j);
                    // Ausgabe Zahlenpaar "Zahl1" "Zahl2" (ggT = "ggt")
                    if (ggT > z) {
                        System.out.println(i + " " + " " + j + " (ggT = " + ggT + ")");
                    }
                }
            }
        }
    }
//
    public static void main(String[] args) {
        System.out.println(ggTrekursiv(24, 9));
        System.out.println(ggTrekursiv(4, 4));
        System.out.println(ggTrekursiv(11, 13));
        System.out.println(ggTrekursiv(2, 0));
        System.out.println();
        System.out.println(kgV(24, 81));
        System.out.println(kgV(4, 4));
        System.out.println(kgV(11, 13));
        System.out.println(kgV(2, 0));
        System.out.println();
        gibZahlenpaareAus(70, 100, 13);
        System.out.println();
        System.out.println(kgV(2,0));
    }
}
