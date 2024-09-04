import java.util.Scanner;
import java.util.Locale;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nomeP;
        double quantP, precoP, total, totalAPagar; 

        nomeP = sc.nextLine();
        quantP = sc.nextDouble();
        precoP = sc.nextDouble();

        total = quantP * precoP;

        if(quantP > 0 && quantP <= 5) {
            totalAPagar = total - (total * 0.02);

            System.out.printf("Nome do produto: %s \nTotal da compra: R$%.2f \nDesconto recebido: 2%% \nTotal a pagar: R$%.2f", nomeP, total, totalAPagar);
        } else if(quantP > 5 && quantP <= 10) {
            totalAPagar = total - (total * 0.03);

            System.out.printf("Nome do produto: %s \nTotal da compra: R$%.2f \nDesconto recebido: 3%% \nTotal a pagar: R$%.2f", nomeP, total, totalAPagar);
        } else {
            totalAPagar = total - (total * 0.05);

            System.out.printf("Nome do produto: %s \nTotal da compra: R$%.2f \nDesconto recebido: 5%% \nTotal a pagar: R$%.2f", nomeP, total, totalAPagar);
        }

        sc.close();
    }
}