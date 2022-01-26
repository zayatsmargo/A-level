package com.company.zayats.hw23.DAO;

import com.company.zayats.hw23.entity.Device;
import com.company.zayats.hw23.repository.DeviceRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class DeviceDAO {
    DeviceRepository deviceRepository = new DeviceRepository();

    public void generateDevices() {
        deviceRepository.createDevice("Samsung", "S345", 4488, Date.valueOf(LocalDate.now()), "energy saving", true, 1);
        deviceRepository.createDevice("Iphone", "12", 21000, Date.valueOf(LocalDate.now()), "charges quickly", false, 2);
        deviceRepository.createDevice("Redmi", "A14", 14000, Date.valueOf(LocalDate.now()), "energy saving", true, 3);
        deviceRepository.createDevice("Xiaomi", "KE5", 7300, Date.valueOf(LocalDate.now()), "charges quickly", false, 4);
        deviceRepository.createDevice("Nokia", "H-68", 10455, Date.valueOf(LocalDate.now()), "waterproof", true, 2);
        deviceRepository.createDevice("Iphone", "11 pro", 20455, Date.valueOf(LocalDate.now()), "big screen", false, 1);
        deviceRepository.createDevice("Nokia", "J4", 1600, Date.valueOf(LocalDate.now()), "waterproof", false, 3);
        deviceRepository.createDevice("Redmi", "45", 6460, Date.valueOf(LocalDate.now()), "big screen", true, 3);
        deviceRepository.createDevice("LG", "Q13", 8300, Date.valueOf(LocalDate.now()), "shockproof", false, 1);
        deviceRepository.createDevice("Samsung", "A-21", 6000, Date.valueOf(LocalDate.now()), "shockproof", true, 2);
    }

    public Device getDeviceById(long id) {
        return deviceRepository.getById(id);
    }

    public void updateDevice(Device device, long id) {
        deviceRepository.updateDevice(device, id);
    }

    public void deleteDevice(long id) {
        deviceRepository.deleteDevice(id);
    }

    public List<Device> getAllDevicesFromFactory(long id) {
        return deviceRepository.getAllDevicesFromFactory(id);
    }

}
