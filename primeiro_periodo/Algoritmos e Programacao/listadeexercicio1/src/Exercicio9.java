import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");

        int decimal = sc.nextInt();

        int temp = decimal;
        String hexadecimal = "";

        while (temp > 0) {
            int remainder = temp % 16;
            char hexDigit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            hexadecimal = hexDigit + hexadecimal;
            temp /= 16;
        }

        System.out.println(hexadecimal);

        sc.close();
    }
}