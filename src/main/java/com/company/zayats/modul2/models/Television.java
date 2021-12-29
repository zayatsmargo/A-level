package com.company.zayats.modul2.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Television extends Technics {
    private String diagonal;
    private String country;

    @Override
    public String toString() {
        return "Television{" +
                "screenType='" + screenType + '\'' +
                ", price=" + price +
                ", series='" + series + '\'' +
                ", diagonal='" + diagonal + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
