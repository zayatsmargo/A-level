package com.company.zayats.hw11.phone;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class LandlinePhone extends Phone {
    private boolean answerphone;
    private boolean display;

    public LandlinePhone(boolean answerphone, boolean display) {
        this.answerphone = answerphone;
        this.display = display;
    }

    public void connectWire(){
        System.out.println("You connected the wire");
    }

    @Override
    public void call() {
        System.out.println("You call from landline phone");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandlinePhone that = (LandlinePhone) o;
        return answerphone == that.answerphone && display == that.display;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerphone, display, isBroken);
    }
}
