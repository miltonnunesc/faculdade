package ListaExercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException e) { // O código pede ao usuário para inserir um número. Se o usuário digitar algo que não seja um número (por exemplo, letras), uma exceção InputMismatchException é capturada e tratada, exibindo uma mensagem de erro.
            System.out.println("Erro: Por favor, insira um número válido!");
        }

        sc.close();
    }
}
