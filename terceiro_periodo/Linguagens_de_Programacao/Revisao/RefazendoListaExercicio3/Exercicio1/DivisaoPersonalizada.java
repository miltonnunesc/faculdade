package RefazendoListaExercicio3.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class DivisaoPersonalizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            int dividendo = sc.nextInt();
            int divisor = sc.nextInt();
            int resultado = dividir(dividendo, divisor);

            System.out.println("Resultado da divisão: " + resultado);

        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static int dividir(int dividendo, int divisor) throws DivisaoPorZeroException{
        if(divisor == 0){
            throw new DivisaoPorZeroException("Divisão impossível.");
        }

        return dividendo / divisor;
    }
}
