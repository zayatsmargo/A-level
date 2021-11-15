package modul;

import java.util.Arrays;

public class Lock {


    private static int[] mass;
    private static boolean isLock = false;
    public Lock(int[] array) {
        if (!isLock) {
            mass = array.clone();
            isLock = true;
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(mass));
    }

    public int[] getArray() {
        return (mass == null) ? null : mass.clone();
    }
}

