import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasM, horasD, valorM, valorD, salarioM, salarioD;

        // Horas por aula e valor por hora do professor mestre.
        System.out.println("Informe as horas de aula e o valor por aula do Professor com Mestrado.");
        horasM = sc.nextInt();
        valorM = sc.nextInt();

        // Horas por aula e valor por aula do professor doutor.
        System.out.println("Informe as horas de aula e o valor por aula do Professor com Doutorado.");
        horasD = sc.nextInt();
        valorD = sc.nextInt();

        salarioM = horasM * valorM;
        salarioD = horasD * valorD;

        System.out.printf("Salário do Professor Mestre: R$%d\n", salarioM);
        System.out.printf("Salário do Professor Doutor: R$%d\n", salarioD);

        if(salarioD > salarioM) {
            System.out.println("O salário do Professor Doutor é maior.");
        } else {
            System.out.println("O salário do Professor Mestre é maior.");
        }

        sc.close();
    }
}