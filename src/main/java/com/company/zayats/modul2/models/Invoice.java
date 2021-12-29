package com.company.zayats.modul2.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@ToString
@Getter
@Setter

public class Invoice {
    private Customer customer;
    private String type;
    private List<Technics> list;

    public Invoice(List<Technics> list, int limit, Customer customer) {
        int totalPrice = 0;
        this.list = list;
        this.customer = customer;
        for (Technics technics : list) {
            totalPrice += technics.getPrice();
        }
        if (totalPrice > limit) {
            type = "wholesale";
        } else {
            type = "retail";
        }
    }
}
