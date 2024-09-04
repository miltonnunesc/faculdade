import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double base, altura, area;

        base = sc.nextDouble();
        altura = sc.nextDouble();
        area = base * altura;

        System.out.println("Area do retangulo: " + area);
        
        sc.close();
    }
}