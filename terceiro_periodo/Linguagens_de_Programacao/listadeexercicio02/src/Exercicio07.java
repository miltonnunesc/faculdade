public class Exercicio07 {
    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("MDC: " + mdc(48, 18));
    }
}
