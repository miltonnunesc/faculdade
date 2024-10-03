public class Exercicio06 {
    public static boolean isPalindromo(String s, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (s.charAt(inicio) != s.charAt(fim)) {
            return false;
        }
        return isPalindromo(s, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        String palavra = "radar";
        System.out.println("É palíndromo: " + isPalindromo(palavra, 0, palavra.length() - 1));
    }

}
