package hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = scanner.nextInt();
            if (n < 4) {
                System.out.println("The size should be 4 or more, try again");
                continue;
            }

            int[] array = new int[n];
            Random random = new Random();
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(n);
                if (array[i] % 2 == 0)
                    counter++;
            }

            System.out.println(Arrays.toString(array));

            if (counter > 0) {
                int[] array2 = new int[counter];
                counter = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        array2[counter] = array[i];
                        counter++;
                    }
                }
                System.out.println(Arrays.toString(array2));
            } else {
                System.out.println("there is no even elements in your array!");
            }
        }
    }
}
