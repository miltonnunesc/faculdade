import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num, media = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Escreve um número.");
            num = sc.nextInt();

            media += num;
        }

        media = media / 10;

        System.out.println("A média dos valores é: " + media);

        sc.close();
    }
}