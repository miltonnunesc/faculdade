public class Exercicio03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Erro: Índice fora dos limites do array!");
        }
    }
}