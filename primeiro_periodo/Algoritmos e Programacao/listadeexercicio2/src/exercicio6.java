import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double prod1, prod2, prod3, prod4, valorCompra;

        prod1 = sc.nextDouble();
        prod2 = sc.nextDouble();
        prod3 = sc.nextDouble();
        prod4 = sc.nextDouble();

        valorCompra = prod1 + prod2 + prod3 + prod4;

        if(valorCompra <= 100) {
            System.out.println("Sem desconto.");
            System.out.println("Valor: R$" + valorCompra);
            
        } else if(valorCompra > 100 && valorCompra <= 200) {
            valorCompra = 0;
            prod1 = prod1 - (prod1 * 0.1);
            valorCompra = prod1 + prod2 + prod3 + prod4;
            System.out.println("Desconto de 10% no Primeiro produto.");
            System.out.println("Valor: R$" + valorCompra);

        } else if(valorCompra > 200 && valorCompra <= 500) {
            valorCompra = 0;
            prod1 = prod1 - (prod1 * 0.15);
            prod2 = prod2 - (prod2 * 0.15);
            valorCompra = prod1 + prod2 + prod3 + prod4;
            System.out.println("Desconto de 15% no Primeiro e Segundo produto.");
            System.out.println("Valor: R$" + valorCompra);

        } else {
            valorCompra = valorCompra - (valorCompra * 0.25);
            System.out.println("Desconto de 25% no valor total da compra.");
            System.out.println("Valor: R$" + valorCompra);
        }

        sc.close();
    }
}
