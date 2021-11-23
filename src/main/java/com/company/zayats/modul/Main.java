package com.company.zayats.modul;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        Actions actions = new Actions();
        int[] array = userInputService.createAndFillArray();
        userInputService.arraySorting(array);
        actions.everyThirdNumberInCube(array);
        Lock lock = new Lock(array);
        lock.getArray()[0] = 10;
        lock.printArray();
        array[0] = 10;
        lock = new Lock(array);
        lock.printArray();
    }
}
