import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int idade, altura, sexo;

        idade = sc.nextInt();
        altura = sc.nextInt();
        sexo = sc.nextInt();

        if(sexo == 1 || sexo == 2) {
            if(sexo == 1) {
                if(altura >= 180 && idade > 16){
                    System.out.println("Apto a jogar no time Feminino Juvenil de Basquete.");
                } else {
                    System.out.println("Não apto.");
                }
            } else {
                if(altura >= 180 && idade > 16){
                    System.out.println("Apto a jogar no time Masculino Juvenil de Basquete.");
                } else {
                    System.out.println("Não apto.");
                }
            }
        } else {
            System.out.println("Gênero inválido.");
        }

        sc.close();
    }
}