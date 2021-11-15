package modul;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        int[] array = userInputService.arrayFill();
        userInputService.arraySorting(array);
        Lock lock = new Lock(array);
        final Random random = new Random();
        System.out.println(Arrays.toString(lock.getInputTableArray()));
    }
}
