public class TennisSpielerinTest {
    public static void main(String[] args) {
        //Maier
        TennisSpielerin t1 = new TennisSpielerin();

        t1.setName("Maier");
        t1.setAlter(18);
        System.out.println(t1.getName() + " \t " + t1.getAlter());

        //Schmid
        TennisSpielerin t2 = new TennisSpielerin();
        t2.setName("Schmid");
        t2.setAlter(45);
        System.out.println(t2.getName() + " \t " + t2.getAlter());

        //Berger
        TennisSpielerin t3 = new TennisSpielerin();
        t3.setName("Berger");
        t3.setAlter(36);
        System.out.println(t3.getName() + " \t " + t3.getAlter());
    }
}
