package ListaExercicio3;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero para calcular a raiz quadrada: ");
        double num = sc.nextDouble();
        
        try {
            double resultado = calcularRaizQuadrada(num);
            System.out.println("Raiz quadrada: " + resultado);
        } catch (IllegalArgumentException e) { // Essa função calcula a raiz quadrada de um número. Se o número for negativo, uma exceção IllegalArgumentException é lançada, indicando que números negativos não possuem raiz quadrada real. A exceção é capturada e tratada no main.
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }

    public static double calcularRaizQuadrada(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Erro: Numero negativo nao tem raiz quadrada real.");
        }
        return Math.sqrt(num);
    }
}