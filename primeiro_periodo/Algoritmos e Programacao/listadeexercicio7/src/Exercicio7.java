import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        
        int somaDivisores = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == numero) {
            System.out.println("O número " + numero + " é perfeito.");
        } else {
            System.out.println("O número " + numero + " não é perfeito.");
        }

        sc.close();
    }
}