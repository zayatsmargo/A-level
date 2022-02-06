package com.company.zayats.hw31;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private static int counter = 1;
    private static int numbersCounter = 0;
    private static int result = 0;
    private static final List<Integer> numbers = new ArrayList<>();

    static class MessageThread extends Thread {
        @SneakyThrows
        public void run() {
            setName(String.valueOf(counter++));
            while (!getNumber()) {
                System.out.println("Thread number " + getName() + " working on it");
                getNumber();
            }
        }
    }

    public static synchronized boolean getNumber() {
        if (numbersCounter < numbers.size()) {
            result += numbers.get(numbersCounter++);
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(11);
        numbers.add(13);
        MessageThread thread1 = new MessageThread();
        MessageThread thread2 = new MessageThread();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Sum of numbers - " + result);
        System.out.println("Numbers amount - " + numbers.size());
    }
}
