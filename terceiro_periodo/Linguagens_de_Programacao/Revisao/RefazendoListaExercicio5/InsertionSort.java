package RefazendoListaExercicio5;

import java.util.Random;

public class InsertionSort {
    public static void insertionSort(int[] v){
        int aux, j;
        for(int i = 1; i < v.length; i++){
            aux = v[i];
            j = i - 1;
            while(j >= 0 && v[j] > aux){
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = aux;
        }
    }

    public static void main(String[] args) {
        int[] v = new int[10];
        Random r = new Random();

        for(int i = 0; i < v.length; i++){
            v[i] = r.nextInt(99);
        }

        System.out.println("Matriz Original.");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

        insertionSort(v);
        
        System.out.println("\nMatriz Ordenada.");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

    }
}
