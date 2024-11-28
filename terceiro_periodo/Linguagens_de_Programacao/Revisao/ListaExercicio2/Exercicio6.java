package ListaExercicio2;

public class Exercicio6 {
    public static boolean verificarPalindromo(String str, int inicio, int fim) {
        // Caso base: Se os ponteiros se cruzaram ou são iguais, é um palíndromo
        if (inicio >= fim) {
            return true;
        }

        // Se os caracteres nas posições atuais não são iguais, não é palíndromo
        if (str.charAt(inicio) != str.charAt(fim)) {
            return false;
        }

        // Recursivamente verifica os próximos caracteres
        return verificarPalindromo(str, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        String palavra = "arara";
        System.out.println("É palíndromo? " + verificarPalindromo(palavra, 0, palavra.length() - 1));
    }
}
