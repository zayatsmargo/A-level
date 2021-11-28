package com.company.zayats.hw11.service;

import com.company.zayats.hw11.phone.ButtonPhone;
import com.company.zayats.hw11.phone.LandlinePhone;
import com.company.zayats.hw11.phone.Phone;
import com.company.zayats.hw11.phone.Smartphone;

public class Service {
    public void repairPhone(Phone phone) {
        Phone phone1 = createReferencePhone(phone);
        phone1.isBroken = false;
        if (phone.isBroken) {
            if (phone instanceof Smartphone) {
                if (!((Smartphone)phone1).equals(phone) && ((Smartphone)phone1).hashCode() != phone.hashCode()) {
                    System.out.println("Phones are different");
                }
                ((Smartphone) phone).takePhoto();
            } else if (phone instanceof ButtonPhone) {
                if (!((ButtonPhone)phone1).equals(phone) && ((ButtonPhone)phone1).hashCode() != phone.hashCode()) {
                    System.out.println("Phones are different");

                }
                ((ButtonPhone) phone).pressButton();
            } else {
                if (!((LandlinePhone)phone1).equals(phone) && ((LandlinePhone)phone1).hashCode() != phone.hashCode()) {
                    System.out.println("Phones are different");
                }
                ((LandlinePhone) phone).connectWire();
            }
            phone.call();
            phone.isBroken = false;
        }
    }

    private Phone createReferencePhone(Phone phone) {
        if (phone instanceof Smartphone) {
            return new Smartphone(phone);
        } else if (phone instanceof ButtonPhone) {
            return new ButtonPhone(phone);
        } else {
            return new LandlinePhone(phone);
        }
    }
}
