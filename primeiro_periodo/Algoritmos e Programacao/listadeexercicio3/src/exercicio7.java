/*
 * Ler um caractere, determinar e escrever o seu antecessor e seu sucessor na tabela ASCII.
 */

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char caractere, antecessor, sucessor;

        caractere = sc.next().charAt(0);

        // (char) é um cast. E é ele que converte o número inteiro no correspondente da tabela ASCII.
        antecessor = (char) (caractere - 1);
        sucessor = (char) (caractere + 1);

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}