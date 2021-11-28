package com.company.zayats.hw11.phone;

public abstract class Phone {
    public boolean isBroken;

    public abstract void call();

    public void toBroke() {
        isBroken = true;
    }
}
