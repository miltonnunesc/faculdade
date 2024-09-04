import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        
        x = sc.nextInt();

        if(x > 0){
            System.out.println("Valor positivo.");
        } else if(x < 0) {
            System.out.println("Valor negativo.");
        } else if(x == 0){
            System.out.println("Zero.");
        } else {
            System.out.println("Valor inválido.");
        }

        sc.close();
    }
}
