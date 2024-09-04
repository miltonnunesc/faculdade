import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        int palpite = 0;
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroEscolhido = random.nextInt(100) + 1;

        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroEscolhido) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite > numeroEscolhido) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroEscolhido) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número.");
            }
        }

        sc.close();
    }
}