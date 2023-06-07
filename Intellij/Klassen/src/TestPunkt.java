public class TestPunkt {



    public static void main (String[] args){

        Punkt p1 = new Punkt();

        p1.setX(1); p1.setY(2);


          /* Lassen Sie hier die x- und y-Koordinaten von p1 auf der

          Konsole ausgeben, aber in einer Zeile und durch Komma

          getrennt */
        System.out.println(p1.getX() + "," + p1.getY());




        p1.verschiebe(2,2);

        System.out.println(p1.getX()); //Ausgabe: 3

        System.out.println(p1.getY()); //Ausgabe: 4

        //Verschieben Sie p1 um den Vektor (1,-3)
        p1.verschiebe(1,-3);

        //Lassen Sie die x- und y-Koordinaten von p1 ausgeben
        System.out.println(p1.getX() + "," + p1.getY());
        //Erzeugen Sie den zweiten Punkt p2 = (3,5)

        Punkt p2 = new Punkt();
        p2.setX(3); p2.setY(5);

        //Verschieben Sie p2 um den Vektor (0,0)
        p2.verschiebe(0,0);
        //Lassen Sie die x- und y-Koordinaten von p2 ausgeben
        System.out.println(p2.getX() + "," + p2.getY());
        //Erzeugen Sie den dritten Punkt p3 = (2,4)

        Punkt p3 = new Punkt();
        p3.setX(2); p3.setY(4);

        //Test für verschiebeUmEins
        p3.verschiebeUmEins();
        System.out.println(p3.getX() + "," + p3.getY());


        System.out.println(p3.istUrsprung());

        //Übung 7.1 p2=p4, p3=p5
        Punkt p4 = new Punkt();
        p4.setX(2); p4.setY(2);

        Punkt p5 = new Punkt();
        p5.setX(7); p5.setY(-1);

        System.out.println(p4.getX() + "," + p4.getY());
        System.out.println(p5.getX() + "," + p5.getY());

        p4.verschiebe(5,-3);
        System.out.println(p4.getX() + "," + p4.getY());


    }

}