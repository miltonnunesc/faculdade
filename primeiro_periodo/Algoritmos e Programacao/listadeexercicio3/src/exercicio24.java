import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a <= b && a <= c) {
            if(b <= c){
                System.out.printf("Ordem crescente: %d - %d - %d", a, b, c);
            } else {
                System.out.printf("Ordem crescente: %d - %d - %d", a, c, b);
            }
        } else if(b <= a && b <= c){
            if(a <= c){
                System.out.printf("Ordem crescente: %d - %d - %d", b, a, c);
            } else {
                System.out.printf("Ordem crescente: %d - %d - %d", b, c, a);
            }
        } else {
            if(a <= b){
                System.out.printf("Ordem crescente: %d - %d - %d", c, a, b);
            } else {
                System.out.printf("Ordem crescente: %d - %d - %d", c, b, a);
            }
        }

        sc.close();
    }
}
