/*
 * Ler uma medida de tempo em segundos, calcular e escrever a medida
 * correspondente em horas, minutos e segundos.
 */

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos, segundosUsuario;

        segundosUsuario = sc.nextInt();

        horas = segundosUsuario / 3600;
        minutos = (segundosUsuario % 3600) / 60;
        segundos = segundosUsuario % 60;

        System.out.printf("O tempo correspondente é de: %d horas, %d minutos e %d segundos.", horas, minutos, segundos);

        sc.close();
    }
}
