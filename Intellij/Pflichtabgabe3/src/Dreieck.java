public class Dreieck {

    private double seite;


    public Dreieck(double seite) {
        if (seite > 0) {
            this.seite = seite;
        } else {
            this.seite = 0;
        }
    }

    public double getSeite() {
        return seite;
    }

    public void setSeite(double seite) {
        if (seite > 0) {
            this.seite = seite;
        } else {
            this.seite = 0;
        }
    }

    public void skaliereDreieck(double faktor) {
        seite = seite * faktor;
    }

    public double berechneHoehe() {
        return seite * (Math.sqrt(3) / 2);
    }

    public double berechneFlaeche() {
        return Math.pow(seite, 2) * (Math.sqrt(3) / 4);
    }

    public boolean vergleicheDreieck(Dreieck d) {
        return (this.seite == d.seite);

    }
}