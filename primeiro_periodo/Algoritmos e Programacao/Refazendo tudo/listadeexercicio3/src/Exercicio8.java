import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char caractere = sc.next().charAt(0);
        
        if(caractere >= 'A' && caractere <= 'Z') {
            char caractere_minusculo = Character.toLowerCase(caractere);

            System.out.println("Caractere informado: " + caractere);
            System.out.println("Caractere minúsculo: " + caractere_minusculo);
        } else {
            System.out.println("Erro");
        }

        sc.close();
    }
}