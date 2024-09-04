import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        if(num <= 20){
            System.out.println("Valor inválido");
        } else {
            System.out.println("Divisores do número informado:");

            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    System.out.print(i + "\t");
                }
            }
        }

        sc.close();
    }
}