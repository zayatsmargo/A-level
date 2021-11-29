package com.company.zayats.hw11;

import com.company.zayats.hw11.phone.ButtonPhone;
import com.company.zayats.hw11.phone.LandlinePhone;
import com.company.zayats.hw11.phone.Phone;
import com.company.zayats.hw11.phone.Smartphone;
import com.company.zayats.hw11.service.Service;

public class Main {
    public static void main(String[] args) {
        Phone smartphone = new Smartphone(6, 16, "Qualcomm snapdragon 662", 4, 64);
        Phone buttonPhone = new ButtonPhone(2, 4, "Dual Core, SC6531E", 1, 8);
        Phone landline = new LandlinePhone(true, true);
        Service service = new Service();
        smartphone.toBroke();
        service.repairPhone(smartphone);
        service.repairPhone(buttonPhone);
        service.repairPhone(landline);
    }
}
