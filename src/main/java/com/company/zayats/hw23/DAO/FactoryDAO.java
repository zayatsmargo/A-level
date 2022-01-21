package com.company.zayats.hw23.DAO;

import com.company.zayats.hw23.entity.Factory;
import com.company.zayats.hw23.repository.DeviceRepository;
import com.company.zayats.hw23.repository.FactoryRepository;

public class FactoryDAO {
    FactoryRepository factoryRepository = new FactoryRepository();

    public void generateFactories() {
        factoryRepository.createFactory("Apple", "USA");
        factoryRepository.createFactory("Samsung", "South Korea");
        factoryRepository.createFactory("LG", "Seoul");
        factoryRepository.createFactory("Xiaomi", "China");
    }

    public Factory getFactoryById(long id) {
        return factoryRepository.getById(id);
    }

    public String getAllDevicesAndSumForFactory() {
        return factoryRepository.getAllDevicesAndSumForFactory();
    }
}

