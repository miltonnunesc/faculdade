import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A, B, pesoA, pesoB, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        pesoA = A * 3.5;
        pesoB = B * 7.5;
        media = (pesoA + pesoB) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}