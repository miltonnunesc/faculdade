import java.util.Scanner;
import java.lang.Math;

public class Exercicio9 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        double pontoF = sc.nextDouble();
        double yA = Math.pow(pontoF, 2) + 5 * Math.pow(pontoF, 7) + 2 * Math.pow(pontoF, 9);
        double yB = Math.sin(pontoF) / pontoF;
        double yC = Math.pow((1 + 1/pontoF), pontoF);
        double yD = Math.sqrt(Math.log(Math.abs(pontoF) + 1) + Math.log(Math.abs(pontoF) + 1) / Math.log(2));
        double yE = Math.asin(pontoF) + Math.acos(pontoF);

        System.out.println("Expressao A: " + yA);
        System.out.println("Expressão B: " + yB);
        System.out.println("Expressão C: " + yC);
        System.out.println("Expressão D: " + yD);
        System.out.println("Expressão E: " + yE);
        
        sc.close();
    }
}