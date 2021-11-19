package com.company.zayats.modul;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputService {
    private final Scanner scanner = new Scanner(System.in);
    private final Actions actions = new Actions();

    public int[] createAndFillArray() {
        int arrayLength;
        do {
            System.out.println("Введите длину массива (число должно быть >= 10):");
            arrayLength = scanner.nextInt();
        } while (arrayLength < 10);
        int[] temp = new int[arrayLength];
        actions.fillTheArray(temp);
        System.out.println(Arrays.toString(temp));
        return temp;
    }
    public void arraySorting(int[] array){
        int choice;
        boolean isSorted = false;
        do {
            System.out.println("Выберите тип сортировки: " + "\n" + "1.По убыванию;"
                    + "\n" + "2.По возрастанию;" + "\n" + "0.Выход");
            choice = scanner.nextInt();
            switch (choice){
                case 0:
                    isSorted = true;
                    break;
                case 1:
                    actions.descendingSort(array);
                    isSorted = true;
                    break;
                case 2:
                    actions.ascendingSort(array);
                    isSorted = true;
                    break;
                default:
                    System.out.println("Выберите из списка");
            }
        }while (!isSorted);
        System.out.println(Arrays.toString(array));
    }
}
