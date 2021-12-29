package com.company.zayats.modul2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Telephone extends Technics {
    private String model;

    @Override
    public String toString() {
        return "Telephone{" +
                "screenType='" + screenType + '\'' +
                ", price=" + price +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
