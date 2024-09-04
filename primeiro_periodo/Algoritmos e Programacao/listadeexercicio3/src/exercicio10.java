import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleitores, vBrancos, vNulos, vValidos;
        double porcBrancos, porcNulos, porcValidos;

        System.out.println("Número de eleitores: ");
        eleitores = sc.nextInt();

        System.out.println("Número de votos brancos, nulos e válidos: ");
        vBrancos = sc.nextInt();
        vNulos = sc.nextInt();
        vValidos = sc.nextInt();

        int totalVotos = vBrancos + vNulos + vValidos;
        porcBrancos = (double) vBrancos / totalVotos * 100;
        porcNulos = (double) vNulos / totalVotos * 100;
        porcValidos = (double) vValidos / totalVotos * 100;
        
        System.out.println("Total de eleitores: " + eleitores);
        System.out.printf("Votos Brancos: %.2f%%\n", porcBrancos);
        System.out.printf("Votos Nulos: %.2f%%\n", porcNulos);
        System.out.printf("Votos Validos: %.2f%%\n", porcValidos);

        sc.close();
    }
}