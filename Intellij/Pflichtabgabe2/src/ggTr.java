public class ggTr {


    public static int ggTr(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return ggTr(y, (x % y));
        }
    }
        public static void main(String[] args) {
            System.out.println(ggTr(24, 9));
            System.out.println(ggTr(4, 4));
            System.out.println(ggTr(11, 13));
            System.out.println(ggTr(2, 0));
    }
}
