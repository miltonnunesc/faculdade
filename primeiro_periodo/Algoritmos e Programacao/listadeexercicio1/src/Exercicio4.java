import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo os valores X e Y
        System.out.print("Digite o valor de X: ");
        int X = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int Y = sc.nextInt();

        // Inicializando a soma
        int somaImpares = 0;

        // Percorrendo os números entre X e Y
        for (int i = X + 1; i < Y; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }

        // Imprimindo a soma dos números ímpares
        System.out.println("Soma dos números ímpares entre " + X + " e " + Y + ": " + somaImpares);

        sc.close();
    }
}