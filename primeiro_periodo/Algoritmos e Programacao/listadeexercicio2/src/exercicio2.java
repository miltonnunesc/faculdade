import java.util.Scanner;

public class exercicio2 {
    public static void main(String [] args) {

        // Scanner criado
        Scanner sc = new Scanner(System.in);

        // Variáveis criadas
        int nota1, nota2, nota3, media;

        // Recebendo valores
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();

        // Media dos valores
        media = (nota1 + nota2 + nota3) / 3;

        // Mostrando a medias dos valores na tela
        System.out.println(media);

        sc.close();
    }
}
