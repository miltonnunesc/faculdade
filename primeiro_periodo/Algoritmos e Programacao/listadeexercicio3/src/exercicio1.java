import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num, antecessor, sucessor;

        num = sc.nextInt();

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.println("Antecessor: " + antecessor + "\nSucessor: " + sucessor);

        sc.close();
    }
}
