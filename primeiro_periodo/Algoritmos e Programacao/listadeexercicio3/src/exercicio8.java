import java.util.Scanner;
import java.lang.Character; // É essa biblioteca que permite converter um caractere em letra minúscula para maiúscula, ou vice versa.

public class exercicio8 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        char caractere;

        caractere = sc.nextLine().charAt(0);

        // Condição para realizar a conversão de letra minúscula para maiúscula:
        caractere = Character.toUpperCase(caractere);

        /*  Condição para realizar a conversão de letra maiúscula para minúscula:
         *  caractere = Character.toLowerCase(caractere);
         */

        System.out.println(caractere);

        sc.close();
    }
}
