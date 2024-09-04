import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double valorCompra, valorVenda;

        nome = sc.nextLine();
        valorCompra = sc.nextDouble();

        if(valorCompra < 100){
            valorVenda = valorCompra + (valorCompra * 0.7);
            System.out.printf("Nome do produto: %s\nValor da compra: R$%.2f\nValor da venda: R$%.2f", nome, valorCompra, valorVenda);
        } else if(valorCompra >= 100 && valorCompra <= 200){
            valorVenda = valorCompra + (valorCompra * 0.5);
            System.out.printf("Nome do produto: %s\nValor da compra: R$%.2f\nValor da venda: R$%.2f", nome, valorCompra, valorVenda);
        } else {
            valorVenda = valorCompra + (valorCompra * 0.3);
            System.out.printf("Nome do produto: %s\nValor da compra: R$%.2f\nValor da venda: R$%.2f", nome, valorCompra, valorVenda);
        }

        sc.close();
    }
}