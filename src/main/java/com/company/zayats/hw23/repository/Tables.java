package com.company.zayats.hw23.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Tables extends AbstractRepository {
    public void deviceTableCreate() throws ClassNotFoundException {
        String sql = "CREATE TABLE device (" +
                " device_id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, " +
                " type VARCHAR(255) NOT NULL, " +
                " model_name VARCHAR(255) NOT NULL, " +
                " price INT NOT NULL, " +
                " date_of_creation DATE NOT NULL DEFAULT CURRENT_DATE, " +
                " description VARCHAR(255) NOT NULL, " +
                " stock_availability BOOLEAN NOT NULL, " +
                " factory_id INT NOT NULL," +
                " CONSTRAINT fk_factory_device FOREIGN KEY (factory_id) REFERENCES factory (factory_id));";
        try (Connection connection = createConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void factoryTableCreate() throws ClassNotFoundException {
        String sql = "CREATE TABLE factory (" +
                " factory_id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, " +
                " factory_name VARCHAR(255) UNIQUE, " +
                " country VARCHAR(255) NOT NULL);";
        try (Connection connection = createConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
