import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maca, custoTotal;

        maca = sc.nextDouble();

        if(maca < 12 ) {
            custoTotal = maca * 1.30;
            System.out.println("Custo total: " + custoTotal);
        } else {
            custoTotal = maca * 1;
            System.out.println("Custo total: " + custoTotal);
        }

        sc.close();
    }
}
