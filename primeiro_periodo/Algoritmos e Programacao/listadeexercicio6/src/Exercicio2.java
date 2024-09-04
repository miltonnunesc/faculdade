import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < 10; i++){
            num = sc.nextInt();

            if(num > maior){
                maior = num;
            }

            if(num < menor){
                menor = num;
            }
        }

        System.out.printf("Maior valor: %d \nMenor valor: %d", maior, menor);

        sc.close();
    }
}
