package ListaExercicio3;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException exception) { // Esse programa tenta acessar um índice que não existe em um array (por exemplo, índice 5 em um array de tamanho 3). Quando a exceção ArrayIndexOutOfBoundsException é lançada, o erro é capturado e tratado.
            System.out.println("Erro: Índice fora dos limites do array!");
        }
    }
}