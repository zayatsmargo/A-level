package com.company.zayats.hw11.phone;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ButtonPhone extends Phone {
    private int screen;
    private int camera;
    private String cpu;
    private int ram;
    private int storage;

    public ButtonPhone(int screen, int camera, String cpu, int ram, int storage) {
        this.screen = screen;
        this.camera = camera;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
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
        return screen == that.screen && camera == that.camera && ram == that.ram && storage == that.storage && Objects.equals(cpu, that.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screen, camera, cpu, ram, storage, isBroken);
    }
}
