import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0, num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while(i < 10) {
            System.out.print("Escreve um número: ");
            num = sc.nextInt();

            if(maior < num){
                maior = num;
            }

            if(menor > num){
                menor = num;
            }

            i++;
        }

        System.out.printf("Maior valor: %d \nMenor valor: %d", maior, menor);

        sc.close();
    }
}