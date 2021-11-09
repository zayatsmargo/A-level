package hw5;

import java.util.Arrays;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        int[] number = new int[8];
        Random random = new Random();
        int upperBound = 10;
        int lowerBound = 1;
        for(int i=0; i<number.length; i++){
            number[i] = random.nextInt(upperBound-lowerBound) + lowerBound;
        }
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        for(int i=0; i<number.length; i++) {
            if(i%2==0) {
                number[i]=0;
            }
            System.out.print(number[i]+" ");
        }
    }
}
