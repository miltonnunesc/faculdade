import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de eleitores: ");
        int eleitores = sc.nextInt();

        int[] votos = new int[3];

        for(int i = 0; i < votos.length; i++) {
            if(votos[i] == 0) {
                System.out.println("Informe o número de votos em branco: ");
                votos[i] = sc.nextInt();
            } else if (votos[i] == 1) {
                System.out.println("Informe o numero de votos nulos: ");
                votos[i] = sc.nextInt();
            } else {
                System.out.println("Informe o numero de votos validos: ");
                votos[i] = sc.nextInt();
            }
        }

        int total_votos = 0;
        for(int voto : votos){
            total_votos += voto;
        }
        
        double[] porcentagens = new double[3];

        porcentagens[0] = (double) votos[0] / total_votos * 100;
        porcentagens[1] = (double) votos[1] / total_votos * 100;
        porcentagens[2] = (double) votos[2] / total_votos * 100;

        System.out.println("Total de Eleitores: " + eleitores);
        System.out.printf("Porcentagem de Votos Brancos: %.2f%%\n", porcentagens[0]);
        System.out.printf("Porcentagem de Votos Nulos: %.2f%%\n", porcentagens[1]);
        System.out.printf("Porcentagem de Votos Válidos: %.2f%%\n", porcentagens[2]);

        sc.close();
    }
}