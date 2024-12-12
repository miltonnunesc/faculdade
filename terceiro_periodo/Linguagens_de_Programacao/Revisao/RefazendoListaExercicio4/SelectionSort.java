package RefazendoListaExercicio4;

import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int[] v){

        int posicao_menor, aux;
        for(int i = 0; i < v.length; i++){
            posicao_menor = i;
            for(int j = i + 1; j < v.length; j++){
                if(v[j] < v[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = v[posicao_menor];
            v[posicao_menor] = v[i];
            v[i] = aux;
        }
    }
    public static void main(String[] args) {
        int[] v = new int[10];
        Random r = new Random();

        for(int i = 0; i < v.length; i++){
            v[i] = r.nextInt(99);
        }

        System.out.println("Vetor Original");
        for(int num : v){
            System.out.print(num + " ");
        }

        selectionSort(v);

        System.out.println("\nVetor Ordenado");
        for(int num : v){
            System.out.print(num + " ");
        }
    }
}
