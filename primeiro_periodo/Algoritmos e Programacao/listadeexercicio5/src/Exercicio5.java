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

       while(menor <= maior){
            if(menor % 2 == 0){
                System.out.print(menor + "\t");
            }
            menor++;
       }

       sc.close();
    }
}

       // Versão mil vezes mais extensa, mas que também funciona igual a de cima.

        /* Scanner sc = new Scanner(System.in);

        int num1, num2, par;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 > num2){
            int i = num2;

            System.out.println("Números pares: ");
            while(i < num1){
                par = i % 2;
                if(par == 0){
                    System.out.print(i + "\t");
                }

                i++;
            }
        } else {
            int i = num1;

            System.out.println("Números pares: ");
            while(i < num2){
                par = i % 2;
                if(par == 0){
                    System.out.print(i + "\t");
                }

                i++;
            }
        }
             */