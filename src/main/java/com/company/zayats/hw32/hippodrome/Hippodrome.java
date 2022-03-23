package com.company.zayats.hw32.hippodrome;

import java.time.LocalTime;
import java.util.Random;

public class Hippodrome extends Thread {

    private final Random random = new Random();

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();
        final int sleep = random.nextInt(101)+400;
        try {
            for (int i = 0; i < 1000; i += random.nextInt(101)+100) {
                    Thread.sleep(sleep);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(LocalTime.now() + "::" + name + " finished");
    }
}
