package com.company.zayats.hw31;

import lombok.SneakyThrows;

public class Messages {
    private static int counter = 0;

    static class MessageThread extends Thread {
        @SneakyThrows
        public void run() {
            setName(String.valueOf(counter++));
            MessageThread thread = new MessageThread();
            if (counter < 50) {
                thread.start();
                thread.join();
            }
            System.out.println("Hello from thread " + getName());
        }
    }

    public static void main(String[] args) {
        MessageThread thread = new MessageThread();
        thread.start();
    }
}
