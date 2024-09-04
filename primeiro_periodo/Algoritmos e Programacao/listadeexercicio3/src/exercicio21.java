import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if(a == b || a == c || c == b) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
        
        sc.close();
    }
}