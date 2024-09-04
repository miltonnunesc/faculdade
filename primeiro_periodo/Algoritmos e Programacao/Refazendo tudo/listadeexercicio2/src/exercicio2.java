import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        double media = 0;
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }
        
        for(double somaNotas : notas) {
            media += somaNotas / notas.length;   
        }

        System.out.printf("Media Aritmetica das notas: %.1f", media);

        sc.close();
    }
}