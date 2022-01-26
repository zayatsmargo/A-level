package com.company.zayats.hw24;


import com.company.zayats.hw24.entity.Device;
import com.company.zayats.hw24.entity.Factory;
import com.company.zayats.hw24.repository.MethodsToAdd;
import com.company.zayats.hw24.repository.MethodsToGet;

import java.time.LocalDate;

public class HibernateRunner {
    public static void main(String[] args) {
        Factory factory1 = MethodsToAdd.addFactory("Xiaomi", "China");
        Factory factory2 = MethodsToAdd.addFactory("Samsung", "South Korea");
        Factory factory3 = MethodsToAdd.addFactory("LG", "Seoul");
        Factory factory4 = MethodsToAdd.addFactory("Apple", "USA");
        Device device1 = MethodsToAdd.addDevice("Telephone1", "Xiaomi", 3500.50, LocalDate.now(), "energy saving", true, factory1);
        Device device2 = MethodsToAdd.addDevice("Telephone2", "Xiaomi", 4620.43, LocalDate.now(), "charges quickly", false, factory1);
        Device device3 = MethodsToAdd.addDevice("Telephone3", "Samsung", 8200.0, LocalDate.now(), "energy saving", true, factory1);
        Device device4 = MethodsToAdd.addDevice("Telephone4", "Samsung", 10000.5, LocalDate.now(), "charges quickly", false, factory2);
        Device device5 = MethodsToAdd.addDevice("Telephone5", "LG", 3282.30, LocalDate.now(), "energy saving", true, factory2);
        Device device6 = MethodsToAdd.addDevice("Television1", "LG", 30000.0, LocalDate.now(), "charges quickly", false, factory2);
        Device device7 = MethodsToAdd.addDevice("Television2", "Apple", 13200.0, LocalDate.now(), "big screen", true, factory3);
        Device device8 = MethodsToAdd.addDevice("Television3", "Apple", 54300.0, LocalDate.now(), "waterproof", false, factory3);
        Device device9 = MethodsToAdd.addDevice("Television4", "Samsung", 31000.0, LocalDate.now(), "big screen", true, factory4);
        Device device10 = MethodsToAdd.addDevice("Television5", "Samsung", 19999.9, LocalDate.now(), "waterproof", false, factory4);
        MethodsToGet.getDeviceId(2);
        MethodsToGet.getFactoryId(1);
        MethodsToGet.getAllDevicesFromFactory(4);
        MethodsToGet.getAllDevicesAndSumForFactory();
        MethodsToAdd.updateDevice(device2);
        MethodsToAdd.deleteDevice(device2);
    }
}

