import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        nome = sc.nextLine();
        idade = sc.nextInt();

        if(idade <= 12) {
            System.out.printf("Nome do Paciente: %s\nIdade do paciente: %d\nEspecialidade: Pediatra.", nome, idade);
        } else if(idade > 12 && idade <= 59){
            System.out.printf("Nome do Paciente: %s\nIdade do paciente: %d\nEspecialidade: Clínica Geral.", nome, idade);
        } else {
            System.out.printf("Nome do Paciente: %s\nIdade do paciente: %d\nEspecialidade: Geriatra.", nome, idade);
        }

        sc.close();
    }
}
