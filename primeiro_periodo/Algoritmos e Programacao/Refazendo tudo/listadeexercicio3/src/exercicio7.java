import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char valor, antecessor, sucessor;

        valor = sc.next().charAt(0);

        antecessor = (char) (valor - 1);
        sucessor = (char) (valor + 1); 

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Valor informado: " + valor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}