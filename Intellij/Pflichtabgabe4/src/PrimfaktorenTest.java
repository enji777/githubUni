public class PrimfaktorenTest {
    public static void main(String[] args) {
        System.out.print("[");
        for (int i : Primfaktoren.primeFactorize(7644)) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
