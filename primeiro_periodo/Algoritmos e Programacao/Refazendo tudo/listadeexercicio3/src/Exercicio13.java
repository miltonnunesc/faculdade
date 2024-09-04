import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        if(valor > 10) {
            System.out.println("MAIOR QUE 10!");
        } else {
            System.out.println("NAO E MAIOR QUE 10!");
        }

        sc.close();
    }
}
