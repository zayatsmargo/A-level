package hw5;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Random random = new Random();
        int upperBound = 99;
        int lowerBound = 10;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound-lowerBound) + lowerBound;
        }
        System.out.println(Arrays.toString(numbers));
        boolean mas = true;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<=numbers[i-1]){
                mas = false;
                break;
            }
        }
        if(mas){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
