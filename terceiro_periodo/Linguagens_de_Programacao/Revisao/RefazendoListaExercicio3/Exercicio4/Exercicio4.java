package RefazendoListaExercicio3.Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Informe uma idade.");
            int idade = sc.nextInt();

            idade = verificarIdade(idade);

            System.out.println("Idade informada: " + idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }

    public static int verificarIdade(int idade) throws IdadeInvalidaException{
        if(idade < 0 || idade > 150){
            throw new IdadeInvalidaException("Idade inválida.");
        }

        return idade;
    }
}