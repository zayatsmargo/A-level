package com.company.zayats.hw32.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Increment implements Callable<Integer> {
    int res;
    Semaphore sem;
    private Integer variable;

    public Increment(int res, Semaphore sem, Integer variable) {
        this.res = res;
        this.sem = sem;
        this.variable = variable;
    }

    @Override
    public Integer call() throws Exception {
        try {
            sem.acquire();
            res = 1;
            variable += 2;
            res++;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            sem.release();
        }
        return variable;
    }
}
