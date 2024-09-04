import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = sc.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = sc.nextInt();

        System.out.println("Os 10 primeiros termos da PA são:");
        for (int i = 0; i < 10; i++) {
            int termo = primeiroTermo + i * razao;
            System.out.println(termo);
        }

        sc.close();
    }
}