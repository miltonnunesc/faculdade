package RefazendoListaExercicio3.Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            String entrada = sc.nextLine();

            int numero = verificar(entrada);

            System.out.println("Você digitou o número: " + numero);

        } catch (NumeroInformadoException e) {
            System.out.println("Erro: " + e.getMessage());
            
        } finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }

    public static int verificar(String entrada) throws NumeroInformadoException {
        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e){
            throw new NumeroInformadoException("Não é um número.");

        }
    }
}