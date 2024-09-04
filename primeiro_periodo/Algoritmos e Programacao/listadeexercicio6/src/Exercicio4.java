import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num, countPrimo = 0;

        num = sc.nextInt();

        if(num <= 100) {
            System.out.println("Valor inválido.");
        } else {
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    countPrimo++;
                    break;
                } else {
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
