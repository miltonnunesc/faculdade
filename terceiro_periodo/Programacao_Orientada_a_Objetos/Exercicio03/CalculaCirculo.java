import java.util.Scanner;

public class CalculaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circulo c1 = new Circulo();

        System.out.println("Informe o raio do Circulo: ");
        c1.raio = sc.nextDouble();

        c1.CalcularArea(c1.raio);
        c1.CalcularPerimetro(c1.raio);

        sc.close();
    }
}