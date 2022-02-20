package com.company.zayats.modul3;

import com.company.zayats.modul3.repository.UserRepository;
import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "ZayatsMargo2004";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Flyway flyway = Flyway
                .configure()
                .dataSource(url, user, password)
                .load();

        flyway.clean();
        flyway.migrate();

        UserRepository userActionService = new UserRepository();
        userActionService.doActions();
    }
}
