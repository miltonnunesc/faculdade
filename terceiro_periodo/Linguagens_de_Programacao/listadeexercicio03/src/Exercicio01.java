import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        
        try {
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) { // Esse código solicita dois números inteiros do usuário e tenta realizar a divisão. Caso o segundo número seja zero, uma exceção ArithmeticException é lançada e tratada, informando que divisão por zero não é permitida.
            System.out.println("Erro: Divisão por zero não permitida!");
        }        
    }
}
