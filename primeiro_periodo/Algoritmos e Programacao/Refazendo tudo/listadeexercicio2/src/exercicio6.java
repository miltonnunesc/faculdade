import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] produtos = new double[4];

        for(int i = 0; i < produtos.length; i++) {
            produtos[i] = sc.nextDouble();
        }

        double totalCompra = 0;
        
        for(double produto : produtos){
            totalCompra += produto;
        }

        if(totalCompra <= 100){
            System.out.printf("Sem descontos.\nValor da compra: R$%.2f\n", totalCompra);
            
        } else if(totalCompra > 100 && totalCompra <= 200) {
            double desconto = produtos[0] * 0.1;
            totalCompra -= desconto;
            System.out.printf("Desconto de 10%% no primeiro produto.\nValor da compra: R$%.2f\n", totalCompra);

        } else if(totalCompra > 200 && totalCompra <= 500) {
            double desconto = (produtos[0] * 0.15) + (produtos[1] * 0.15);
            totalCompra -= desconto;
            System.out.printf("Desconto de 15%% no primeiro e segundo produto.\nValor da compra: R$%.2f\n", totalCompra);
        } else {
            double desconto = totalCompra * 0.25;
            totalCompra -= desconto;
            System.out.printf("Desconto de 25%% no valor total da compra.\nValor da compra: R$%.2f", totalCompra);
        }

        sc.close();
    }
}
