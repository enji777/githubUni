public class Pruefung {
    public static void main(String[] args){
        int punkte = 45;
        int zusatz = 12;

        if (punkte < 50) {
            zusatz = zusatz / 2;
        }

        int gesamtpunkte = punkte + zusatz;



        if ( gesamtpunkte < 50){
            System.out.println("nicht bestanden");
        }
        else {
            System.out.println("bestanden");
        }

        }
    }
