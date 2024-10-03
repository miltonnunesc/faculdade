public class Exercicio03 {
    public static String inverterString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return inverterString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("String invertida: " + inverterString("abcd"));
    }

}
