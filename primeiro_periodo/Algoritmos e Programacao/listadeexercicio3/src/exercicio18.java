import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, resultado, usuario;

        System.out.println("Informe dois valores:");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Escolha uma opção:\n1 = Soma\n2 = Subtração\n3 = Multiplicação\n4 = Divisão");
        usuario = sc.nextInt();

        if(usuario == 1) {
            resultado = x + y;
            System.out.println("O resultado da sua soma é: " + resultado);
        } else if(usuario == 2) {
            resultado = x - y;
            System.out.println("O resultado da sua subtração é: " + resultado);
        } else if(usuario == 3) {
            resultado = x * y;
            System.out.println("O resultado da sua multiplicação é: " + resultado);
        } else {
            if(y == 0) {
                System.out.println("Não é possível dividir por 0.");
            } else {
                resultado = x / y;
                System.out.println("O resultado da sua divisão é: " + resultado);
            }
        }

        sc.close();
    }
}