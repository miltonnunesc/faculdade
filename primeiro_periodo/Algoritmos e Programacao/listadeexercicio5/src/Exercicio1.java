import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int i = 0, num, media = 0;

        while(i < 10) {
            System.out.println("Escreva um número");
            num = sc.nextInt();

            media += num;

            i++;
        }

        media = media / 10;

        System.out.println("A média dos valores é: " + media);

        sc.close();
    }
}