import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 2, num, fiboAtual = 1, fiboAnterior = 0;

        num = sc.nextInt();

        while(i <= num) {
            int proximoFibo = fiboAtual + fiboAnterior;
            fiboAnterior = fiboAtual;
            fiboAtual = proximoFibo;
            i++;
        }

        System.out.println("O elemento na posição " + num + " da sequência de Fibonacci é: " + fiboAtual);

        sc.close();
    }
}