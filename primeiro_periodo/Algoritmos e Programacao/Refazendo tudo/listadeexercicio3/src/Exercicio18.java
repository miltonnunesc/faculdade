import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        System.out.println("Selecione uma das opcoes: \n1 - Soma \n2 - Diferenca \n3 - Produto \n4 - Divisao \n5 - Resto da Divisao \n6 - Potencia \n7 - Raiz Quadrada");
        int operacao = sc.nextInt();

        if(operacao == 1) {
            int resultado = valor1 + valor2;
            System.out.println("Valor da soma: " + resultado);
        } else if(operacao == 2) {
            int resultado = valor1 - valor2;
            System.out.println("Valor da subtracao: " + resultado);
        } else if(operacao == 3) {
            int resultado = valor1 *  valor2;
            System.out.println("Valor da multiplicacao: " + resultado);
        } else if(operacao == 4) {
            if(valor2 == 0) {
                System.out.println("Nao e possivel dividir por zero.");
            } else {
                int resultado = valor1 / valor2;
                System.out.println("Valor da divisao: " + resultado);
            }
        } else if(operacao == 5) {
            int resultado = valor1 % valor2;
            System.out.println("Valor do resto da divisao: " + resultado);
        } else if(operacao == 6) {
            double resultado = Math.pow(valor1, valor2);
            System.out.println("Valor da potencia: " + resultado);
        } else if(operacao == 7) {
            double resultado = Math.sqrt(valor1);
            double resultado2 = Math.sqrt(valor2);
            System.out.printf("Valor das raizes: %.2f, %.2f", resultado, resultado2);
        } else {
            System.out.println("Opcao incorreta.");
        }

        sc.close();
    }
}