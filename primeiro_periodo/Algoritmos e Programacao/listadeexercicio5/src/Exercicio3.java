import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int divisor = 1, dividendo;

        System.out.println("Informe um número intero maior que 20: ");
        dividendo = sc.nextInt();

        if(dividendo > 20) {
            while(divisor <= dividendo) {
                if(dividendo % divisor == 0){
                    System.out.print(divisor + "\t");
                }
                divisor++;
            }
        } else {
            System.out.println("Valor inválido.");
        }

        sc.close();
    }
}