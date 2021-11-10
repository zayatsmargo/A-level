package com.zayats.hw6;

public enum Manufacturer {
    ITALIA("Италия"), GERMANY("Германия"), JAPANY("Япония"), FRANCE("Франция");
    String russianName;
    Manufacturer(String russianName){
        this.russianName =russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}


