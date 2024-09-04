/* Faça um programa que leia três notas de um aluno, calcule e escreva a média 
final deste aluno. Considerar que a média é ponderada e que o peso das 
notas é 2, 3 e 5. Fórmula para o cálculo da média final é:

𝑚𝑒𝑑𝑖𝑎 = 𝑛1 × 2 + 𝑛2 × 3+ 𝑛3 × 5 / 2 + 3 + 5 */


import java.util.Scanner;

public class exercicio4 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, mediaP;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        mediaP = (n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5);

        System.out.println("Média final: " + mediaP);

        sc.close();
   }
}
