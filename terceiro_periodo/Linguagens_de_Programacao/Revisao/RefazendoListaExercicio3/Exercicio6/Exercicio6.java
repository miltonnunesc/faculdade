package RefazendoListaExercicio3.Exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Informe o dividendo.");
            int dividendo = sc.nextInt();

            System.out.println("Informe o divisor.");
            int divisor = sc.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado da divisão: " + resultado);

            int[] array = {1, 2, 3, 4, 5};

            System.out.println("Informe o indice que desejar acessar.");
            int indice = sc.nextInt();

            System.out.println("Valor no índice " + indice + " :" + array[indice]);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            
        } finally {
            System.out.println("Sistema finalizado.");
            sc.close();
        }
    }
}