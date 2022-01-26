package com.company.zayats.hw23.repository;

import com.company.zayats.hw23.entity.Factory;

import java.sql.*;
import java.util.Arrays;

public class FactoryRepository extends AbstractRepository {
    public void createFactory(String name, String country) {
        String sql = "INSERT INTO public.factory(factory_name, country) Values (?, ?)";
        try (Connection connection = createConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, country);
            statement.execute();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Factory getById(long factoryId) {
        String sql = "SELECT * FROM factory WHERE factory_id = ?";
        try (Connection connection = createConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, factoryId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Factory factory = new Factory();
                    factory.setFactoryId(resultSet.getLong(1));
                    factory.setFactoryName(resultSet.getString(2));
                    factory.setCountry(resultSet.getString(3));
                    return factory;
                }
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public String getAllDevicesAndSumForFactory() {
        String sqlCount = "SELECT factory.factory_id, COUNT(device.device_id) FROM factory JOIN device ON device.factory_id = factory.factory_id GROUP BY factory.factory_id";
        String sqlSum = "SELECT factory.factory_id, SUM(device.price) FROM factory JOIN device ON device.factory_id = factory.factory_id GROUP BY factory.factory_id";
        String[] result = new String[4];
        int iter = 0;
        try (Connection connection = createConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sqlCount);
            while (resultSet.next()) {
                result[iter++] = ("Factory " + resultSet.getLong(1) + " made " + resultSet.getInt(2) + " devices");

            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        iter = 0;
        try (Connection connection = createConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sqlSum);
            while (resultSet.next()) {
                result[iter++] += (" in the amount of " + resultSet.getInt(2));
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return Arrays.toString(result);
    }
}
