package RefazendoListaExercicio4;

import java.util.Random;

public class BubbleSortdnv {
    public static void bubbleSort(int[] v) {
        int aux;

        for(int i = 0; i < v.length; i++){
            for(int j = i + 1; j < v.length; j++){
                if(v[i] > v[j]){
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();

        int[] array = new int[8];

        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(99);
        }

        System.out.println("Array Original");
        for(int num : array){
            System.out.print(num + " ");
        }

        bubbleSort(array);

        System.out.println("\nArray Ordenado");
        for(int num : array){
            System.out.print(num + " ");
        }
    }
}