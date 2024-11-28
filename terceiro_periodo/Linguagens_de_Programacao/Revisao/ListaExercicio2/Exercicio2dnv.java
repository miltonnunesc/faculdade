package ListaExercicio2;

public class Exercicio2dnv {
    public static int potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        }

        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
           int base = 7;
           int expoente = 5;
           int resultado = potencia(base, expoente);

           System.out.println(base + "^" + expoente + " = " + resultado);
    }
}
