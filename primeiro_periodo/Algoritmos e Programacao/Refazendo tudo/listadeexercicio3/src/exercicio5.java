import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int anos, meses, dias, idadeDias;

        anos = sc.nextInt();
        meses = sc.nextInt();
        dias = sc.nextInt();

        idadeDias = (anos * 365) + (meses * 31) + dias;

        System.out.println("Tempo de vida em dias: " + idadeDias);
        
        sc.close();
    }
}