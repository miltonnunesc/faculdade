import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = 0;
        int E = 0;
        int I = 0;
        int O = 0;
        int U = 0;

        String entrada = sc.nextLine();

        entrada = entrada.toLowerCase();

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c == 'a') {
                A++;
            } else if (c == 'e') {
                E++;
            } else if (c == 'i') {
                I++;
            } else if (c == 'o') {
                O++;
            } else if (c == 'u') {
                U++;
            }
        }

        System.out.println("Vogal 'a': " + A + " ocorrência(s)");
        System.out.println("Vogal 'e': " + E + " ocorrência(s)");
        System.out.println("Vogal 'i': " + I + " ocorrência(s)");
        System.out.println("Vogal 'o': " + O + " ocorrência(s)");
        System.out.println("Vogal 'u': " + U + " ocorrência(s)");

        sc.close();
    }
}