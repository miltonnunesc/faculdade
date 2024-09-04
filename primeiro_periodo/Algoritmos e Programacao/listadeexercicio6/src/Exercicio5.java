import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Números pares entre " + menor + " e " + maior + ": ");

        for(int i = menor; i  <= maior; i++ ){
            if(i % 2 == 0){
                System.out.print(i + "\t");
            }
        }

        sc.close();
    }
}