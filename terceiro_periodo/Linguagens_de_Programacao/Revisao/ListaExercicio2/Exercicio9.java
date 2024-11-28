package ListaExercicio2;

public class Exercicio9 {
    public static int somaNaturais(int n) {
        // Caso base: Se n for 1, retorna 1
        if (n == 1) {
            return 1;
        }

        // Soma n com a soma dos números anteriores
        return n + somaNaturais(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Soma dos números naturais de 1 a " + n + " é: " + somaNaturais(n));
    }
}
