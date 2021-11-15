package modul;

import java.util.Random;

public class Actions {

    public void fillTheArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(200)-100;
        }
    }
    public void descendingSort(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
    

    public void everyThirdNumberInCube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0){
               array[i] = (int) Math.pow(array[i],3);
            }
        }
    }

    public void ascendingSort(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}

