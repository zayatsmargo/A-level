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
            boolean isDifferent = !phone1.equals(phone) && phone1.hashCode() != phone.hashCode();
            if (phone instanceof Smartphone) {
                if (isDifferent) {
                    System.out.println("Phones are different");
                }
                ((Smartphone) phone).takePhoto();
            } else if (phone instanceof ButtonPhone) {
                if (isDifferent) {
                    System.out.println("Phones are different");

                }
                ((ButtonPhone) phone).pressButton();
            } else {
                if (isDifferent) {
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
            return new Smartphone(((Smartphone) phone).getScreen(), ((Smartphone) phone).getCamera(),
                    ((Smartphone) phone).getCpu(), ((Smartphone) phone).getRam(), ((Smartphone) phone).getStorage());
        } else if (phone instanceof ButtonPhone) {
            return new ButtonPhone(((ButtonPhone) phone).getScreen(), ((ButtonPhone) phone).getCamera(),
                    ((ButtonPhone) phone).getCpu(), ((ButtonPhone) phone).getRam(), ((ButtonPhone) phone).getStorage());
        } else {
            return new LandlinePhone(((LandlinePhone) phone).isAnswerphone(), ((LandlinePhone) phone).isDisplay());
        }
    }
}
