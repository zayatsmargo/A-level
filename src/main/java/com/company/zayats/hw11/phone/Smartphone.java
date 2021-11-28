package com.company.zayats.hw11.phone;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Smartphone extends Phone {
    private int screen;
    private int camera;
    private String CPU;
    private int RAM;
    private int storage;

    public Smartphone() {
    }

    public Smartphone(Phone phone){
        this.screen = ((Smartphone) phone).getScreen();
        this.camera = ((Smartphone) phone).getCamera();
        this.CPU = ((Smartphone) phone).getCPU();
        this.RAM = ((Smartphone) phone).getRAM();
        this.storage = ((Smartphone) phone).getStorage();
        this.isBroken = phone.isBroken;
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
        return screen == that.screen && camera == that.camera && RAM == that.RAM && storage == that.storage && Objects.equals(CPU, that.CPU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screen, camera, CPU, RAM, storage, isBroken);
    }
}
