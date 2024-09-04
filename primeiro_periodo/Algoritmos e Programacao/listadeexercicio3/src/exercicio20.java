import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, media;

        System.out.println("Informe suas notas finais: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        media = (n1 + n2) / 2;

        if(media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Informe suas notas de recuperação: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            if(media >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado.");
            }
        }

        sc.close();
    }
}
