package com.company.zayats.hw11.phone;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ButtonPhone extends Phone {
    private int screen;
    private int camera;
    private String CPU;
    private int RAM;
    private int storage;

    public ButtonPhone() {
    }

    public ButtonPhone(Phone phone){
        this.screen = ((ButtonPhone) phone).getScreen();
        this.camera = ((ButtonPhone) phone).getCamera();
        this.CPU = ((ButtonPhone) phone).getCPU();
        this.RAM = ((ButtonPhone) phone).getRAM();
        this.storage = ((ButtonPhone) phone).getStorage();
        this.isBroken = phone.isBroken;
    }

    public void pressButton(){
        System.out.println("You pressed the button");
    }

    @Override
    public void call() {
        System.out.println("You call from button phone");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ButtonPhone that = (ButtonPhone) o;
        return screen == that.screen && camera == that.camera && RAM == that.RAM && storage == that.storage && Objects.equals(CPU, that.CPU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screen, camera, CPU, RAM, storage, isBroken);
    }
}
