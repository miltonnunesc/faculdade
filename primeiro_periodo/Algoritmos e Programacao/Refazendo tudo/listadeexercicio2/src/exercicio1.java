import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        /* int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int soma = n1 + n2 + n3 + n4;

        System.out.println("Resultado da Soma: " + soma);
        */

        int[] numeros = new int[4];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        int soma = 0;

        for(int numero : numeros){
            soma += numero;
        }

        System.out.println("Resultado da Soma: " + soma);

        sc.close();
    }
}