import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor inteiro N: ");
        int N = sc.nextInt();

        int a = 0; 
        int b = 1;

        System.out.print("Sequência de Fibonacci: ");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < N; i++) {
            int proximoTerm = a + b;
            System.out.print(proximoTerm + " ");
            a = b;
            b = proximoTerm;
        }

        System.out.println(); // Pula para a próxima linha

        sc.close();
    }
}