package ListaExercicio3;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        
        int[] array = {1, 2, 3};
        
        try {
            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
            System.out.println(array[5]);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array!");
        } finally {
            System.out.println("Operação finalizada.");
        }
        
        // O programa tenta dividir dois números e acessar um índice fora do limite de um array. Ele trata tanto a exceção de divisão por zero (ArithmeticException) quanto a exceção de índice fora do array (ArrayIndexOutOfBoundsException).
        sc.close();
    }
}
