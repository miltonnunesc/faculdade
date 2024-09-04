import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 0, num, contPos = 0, contNeg = 0, somaPos = 0, somaNeg = 0;

        while(i < 15){
            num = sc.nextInt();

            if(num == 0){
                System.out.println("Zero não é aceito.");
                continue;
            } else {
                if(num > 0){
                    contPos++;
                    somaPos += num;
                } else {
                    contNeg++;
                    somaNeg += num;
                }
            }

            i++;
        }

        System.out.printf("Quantidade de números positivos: %d\n", contPos);
        System.out.printf("Soma dos números positivos: %d\n", somaPos );
        System.out.printf("Quantidade de números negativos: %d\n", contNeg);
        System.out.printf("Soma dos números negativos: %d\n", somaNeg);

        sc.close();
    }
}
