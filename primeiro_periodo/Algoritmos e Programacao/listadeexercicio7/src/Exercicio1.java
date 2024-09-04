import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num, i, tabuada, tabuada2 = 1;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            tabuada = num * i;
            System.out.printf("%d * %d = %d\n",num, tabuada2, tabuada);
            tabuada2++;
        }

        sc.close();
    }
}