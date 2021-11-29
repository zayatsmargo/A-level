package com.company.zayats.hw11.phone;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Smartphone extends Phone {
    private int screen;
    private int camera;
    private String cpu;
    private int ram;
    private int storage;

    public Smartphone(int screen, int camera, String cpu, int ram, int storage) {
        this.screen = screen;
        this.camera = camera;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void takePhoto(){
        System.out.println("You took a photo");
    }

    @Override
    public void call(){
        System.out.println("You call from smartphone");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return screen == that.screen && camera == that.camera && ram == that.ram && storage == that.storage && Objects.equals(cpu, that.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screen, camera, cpu, ram, storage, isBroken);
    }
}
