import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if(x == y) {
            System.out.println("Números iguais.");
        } else if(x > y) {
            System.out.println("O primeiro é maior.");
        } else {
            System.out.println("O segundo é maior.");
        }

        sc.close();
    }
}