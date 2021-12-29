package com.company.zayats.modul2.services;

import au.com.bytecode.opencsv.CSVReader;
import com.company.zayats.modul2.exception.IncorrectReadStringException;
import com.company.zayats.modul2.models.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ShopService {
    private static final Logger log = Logger.getLogger(ShopService.class.getName());

    public Invoice createOrder(Customer customer, int limit) throws IOException {
        Random random = new Random();
        List<List<String>> data = readData();
        List<Technics> technics = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            technics.add(parseData(data.get(random.nextInt(data.size()))));
        }
        String message = "[" + customer + "] [" + technics + "]";
        createLogs(message);
        return new Invoice(technics, limit, customer);
    }

    private Technics parseData(List<String> list) {
        Technics technics;
        if (list.get(0).equals("Telephone")) {
            technics = new Telephone(list.get(2));
        } else {
            technics = new Television(list.get(3), list.get(5));
        }
        technics.setSeries(list.get(1));
        technics.setScreenType(list.get(4));
        technics.setPrice(Integer.parseInt(list.get(6)));
        return technics;
    }

    private List<List<String>> readData() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("src/main/resources/technics.csv"), ',', '"', 1);
        String[] temp;
        List<List<String>> lines = new ArrayList<>();
        while ((temp = reader.readNext()) != null) {
            try {
                checkLine(Arrays.asList(temp), lines.size() + 1);
                lines.add(Arrays.asList(temp));
            } catch (IncorrectReadStringException exception) {
                exception.printStackTrace();
            }
        }
        return lines;
    }

    private void checkLine(List<String> line, int lineNumber) throws IncorrectReadStringException {
        for (String s : line) {
            if (Objects.equals(s, "")) {
                throw new IncorrectReadStringException("line " + (lineNumber + 1) + " is incorrect");
            }
        }
    }

    private void createLogs(String message) throws IOException {
        FileHandler fh = new FileHandler("logs.txt", true);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        log.log(Level.INFO, "Info");
        log.addHandler(fh);
        log.info(message);
        fh.close();
    }
}
