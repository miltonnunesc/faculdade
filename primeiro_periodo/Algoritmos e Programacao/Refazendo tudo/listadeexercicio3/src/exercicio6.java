import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundoInformado, horas, minutos, segundos;

        segundoInformado = sc.nextInt();

        horas = segundoInformado / 3600;
        minutos = (segundoInformado % 3600) / 60;
        segundos = segundoInformado % 60;

        System.out.printf("O tempo correspondente é de: %d horas, %d minutos e %d segundos.", horas, minutos, segundos);

        sc.close();
    }
}