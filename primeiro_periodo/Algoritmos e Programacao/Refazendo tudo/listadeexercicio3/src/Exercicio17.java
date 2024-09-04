import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();

            if(valores[i] > maior) {
                maior = valores[i];
            }

            if(valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);

        sc.close();
    }
}
