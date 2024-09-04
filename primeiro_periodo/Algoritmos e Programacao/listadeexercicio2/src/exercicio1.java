import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        
        // Scanner criado
        Scanner sc = new Scanner(System.in);

        // Varíaveis criadas
        int a, b, c, d, soma;

        // Recebendo valores
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        // Soma dos valores
        soma = a + b + c + d;

        // Mostrando a soma dos valores na tela
        System.out.println(soma);

        sc.close();
    }
}
