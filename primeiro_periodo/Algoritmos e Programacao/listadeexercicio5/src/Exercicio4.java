import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 2, num, countPrimo = 0;

        num = sc.nextInt();

        if(num <= 100){
            System.out.println("Valor inválido.");
        } else {
            while(i < num){
                if(num % i == 0){
                    countPrimo++;
                    break;
                }else{
                    i++;
                }
            }
        }

        if(countPrimo > 0 || num == 1) {
            System.out.println("Não é primo.");
        } else {
            System.out.println("É primo.");
        }

        sc.close();
    }
}