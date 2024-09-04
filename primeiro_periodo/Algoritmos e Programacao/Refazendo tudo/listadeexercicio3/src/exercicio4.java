import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media;
        double[] notas = new double[3];

        for(int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }

        media = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 5)) / (2+3+5);

        System.out.println("Media ponderada das notas: " + media);

        sc.close();
    }
}
