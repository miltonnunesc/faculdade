package RefazendoProva;

public class Questao1 {
    public static double f(int n) {
        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 5;
        }

        return 3 * (f(n - 1) + Math.sqrt(f(n - 2)));
    }
}
