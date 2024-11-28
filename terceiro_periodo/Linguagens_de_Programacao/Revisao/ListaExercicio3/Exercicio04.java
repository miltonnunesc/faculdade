package ListaExercicio3;

import java.util.Scanner;

class IdadeInvalidaException extends Exception { // O código define uma exceção personalizada chamada IdadeInvalidaException. O programa solicita a idade de uma pessoa e, se a idade for menor que 0 ou maior que 150, a exceção é lançada e tratada, exibindo uma mensagem de erro específica.
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        try {
            verificarIdade(idade);
            System.out.println("Idade válida: " + idade);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }

    public static void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Erro: Idade inválida! Deve ser entre 0 e 150.");
        }
    }
}
