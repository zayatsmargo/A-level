package com.company.zayats.hw23;

import com.company.zayats.hw23.DAO.DeviceDAO;
import com.company.zayats.hw23.DAO.FactoryDAO;
import com.company.zayats.hw23.entity.Device;
import com.company.zayats.hw23.repository.Tables;

public class JDBCRunner {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
        Tables tables = new Tables();
        tables.factoryTableCreate();
        tables.deviceTableCreate();
        DeviceDAO deviceDAO = new DeviceDAO();
        FactoryDAO factoryDAO = new FactoryDAO();
        factoryDAO.generateFactories();
        deviceDAO.generateDevices();
        System.out.println(deviceDAO.getDeviceById(7));
        System.out.println(factoryDAO.getFactoryById(2));
        Device device = deviceDAO.getDeviceById(2);
        deviceDAO.updateDevice(device, 3);
        deviceDAO.deleteDevice(3);
        System.out.println(deviceDAO.getAllDevicesFromFactory(2));
        System.out.println(factoryDAO.getAllDevicesAndSumForFactory());
    }
}
