import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n, antecessor, sucessor;

        n = sc.nextInt();

        antecessor = n - 1;
        sucessor = n + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Número informado: " + n);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}