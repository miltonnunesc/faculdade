import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        if(num < 30){
            System.out.println("Valor incorreto.");
        } else {
            System.out.println("Números que são múltiplos de 2 ou de 7.");
            
            for(int i = 2; i < num; i++){
                if(i % 2 == 0 || i % 7 == 0){
                    System.out.print(i + "\t");
                }
            }
        }

        sc.close();
    }
}