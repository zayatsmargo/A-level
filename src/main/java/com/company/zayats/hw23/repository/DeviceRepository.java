package com.company.zayats.hw23.repository;

import com.company.zayats.hw23.entity.Device;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeviceRepository extends AbstractRepository {
    public void createDevice(String type, String modelName, int price, Date dateOfCreation, String description, boolean stockAvailability, long factoryId) {
        String sql = "INSERT INTO public.device(type, model_name, price, date_of_creation, description, stock_availability, factory_id) Values (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = createConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, type);
            statement.setString(2, modelName);
            statement.setInt(3, price);
            statement.setDate(4, dateOfCreation);
            statement.setString(5, description);
            statement.setBoolean(6, stockAvailability);
            statement.setLong(7, factoryId);
            statement.execute();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Device getById(long id) {
        String sql = "SELECT * FROM device WHERE device_id = ?";
        try (Connection connection = createConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Device device = new Device();
                    device.setDeviceId(resultSet.getLong(1));
                    device.setType(resultSet.getString(2));
                    device.setModelName(resultSet.getString(3));
                    device.setPrice(resultSet.getInt(4));
                    device.setDateOfCreation(resultSet.getDate(5));
                    device.setDescription(resultSet.getString(6));
                    device.setStockAvailability(resultSet.getBoolean(7));
                    device.setFactoryId(resultSet.getLong(8));
                    return device;
                }
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void updateDevice(Device device, long id) {
        String sql = "UPDATE device " +
                "SET type = ?, model_name = ?, price = ?, date_of_creation = ?, description = ?, stock_availability = ?, factory_id = ? " +
                "WHERE device_id = ?";
        try (Connection connection = createConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, device.getType());
            statement.setString(2,device.getModelName());
            statement.setInt(3, device.getPrice());
            statement.setDate(4, device.getDateOfCreation());
            statement.setString(5, device.getDescription());
            statement.setBoolean(6, device.isStockAvailability());
            statement.setLong(7, device.getFactoryId());
            statement.setLong(8, id);
            statement.execute();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void deleteDevice(long id) {
        String sql = "DELETE FROM device WHERE device_id = ?";
        try (Connection connection = createConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<Device> getAllDevicesFromFactory(long id) {
        String sql = "SELECT * FROM device JOIN factory ON device.factory_id = factory.factory_id WHERE device.factory_id = ?";
        List<Device> deviceList = new ArrayList<>();
        try (Connection connection = createConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Device device = new Device();
                device.setDeviceId(resultSet.getLong(1));
                device.setType(resultSet.getString(2));
                device.setModelName(resultSet.getString(3));
                device.setPrice(resultSet.getInt(4));
                device.setDateOfCreation(resultSet.getDate(5));
                device.setDescription(resultSet.getString(6));
                device.setStockAvailability(resultSet.getBoolean(7));
                device.setFactoryId(resultSet.getLong(8));
                deviceList.add(device);
            }
            return deviceList;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
