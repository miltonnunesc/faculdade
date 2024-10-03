import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um número válido!");
        }
    }
}
