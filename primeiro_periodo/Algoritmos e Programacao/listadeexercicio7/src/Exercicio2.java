import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fat = 1;

        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            fat = fat * i;
        }
        
        System.out.println(num + "!" + " = " + fat);

        sc.close();
    }
}