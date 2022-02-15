package com.company.zayats.hw32.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Integer number = 50;
        int resource = 0;
        Semaphore sem = new Semaphore(1);
        final ExecutorService pool = Executors.newFixedThreadPool(100);
        final List<Future<Integer>> lists = new ArrayList<>();
        final Callable<Integer> callable;
        callable = new Increment(resource, sem, number);

        for (int i = 0; i < 100; i++) {
            final Future<Integer> future = pool.submit(callable);
            lists.add(future);
        }

        try {
            int variable = 0;
            for (Future<Integer> integerFuture : lists) {
                variable = integerFuture.get();
            }
            System.out.println("Variable : " + variable);
        } catch (ExecutionException | InterruptedException c) {
            System.out.println(c.getMessage());
        } finally {
            pool.shutdown();
        }
    }
}
