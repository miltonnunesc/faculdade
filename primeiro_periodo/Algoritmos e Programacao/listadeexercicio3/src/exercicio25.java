import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeA, timeB;
        int golA, golB;

        System.out.println("Informe o nome do 1º time e em seguida a quantidade de gols: ");
        timeA = sc.nextLine();
        golA = sc.nextInt();

        System.out.println("Informe o nome do 2º time e em seguida a quantidade de gols: ");
        timeB = sc.nextLine();
        golB = sc.nextInt();

        if(golA > golB) {
            System.out.println("O time vencedor é: " + timeA);
        } else if (golB > golA) {
            System.out.println("O time vencedor é: " + timeB);
        } else {
            System.out.println("Empate!");
        }

        sc.close();
    }
}
