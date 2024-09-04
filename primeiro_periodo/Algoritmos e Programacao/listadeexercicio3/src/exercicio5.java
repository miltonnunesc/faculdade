/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
 * com 365 dias e mês com 30 dias
 */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano, mes, dia, idade;

        ano = sc.nextInt();
        mes = sc.nextInt();
        dia = sc.nextInt();

        idade = ano * 365 + mes * 30 + dia;

        System.out.println("Idade em dias: " + idade);

        sc.close();
    }
}
