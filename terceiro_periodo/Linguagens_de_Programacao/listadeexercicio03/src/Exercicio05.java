import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero para calcular a raiz quadrada: ");
        double num = sc.nextDouble();
        
        try {
            double resultado = calcularRaizQuadrada(num);
            System.out.println("Raiz quadrada: " + resultado);
        } catch (IllegalArgumentException e) {
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