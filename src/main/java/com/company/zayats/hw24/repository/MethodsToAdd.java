package com.company.zayats.hw24.repository;

import com.company.zayats.hw24.HibernateUtil;
import com.company.zayats.hw24.entity.Device;
import com.company.zayats.hw24.entity.Factory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class MethodsToAdd {
    public static Factory addFactory(String name, String country) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Factory factory = new Factory(name, country);
        session.save(factory);
        transaction.commit();
        session.close();
        return factory;
    }

    public static Device addDevice(String type, String name, Double price, LocalDate localDate, String description, Boolean availability, Factory factory) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Device device = new Device(type, name, price, localDate, description, availability, factory);
        session.save(device);
        transaction.commit();
        session.close();
        return device;
    }

    public static void updateDevice(Device device) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(device);
        transaction.commit();
        session.close();
        System.out.println("Update " + device);
    }

    public static void deleteDevice(Device device) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(device);
        transaction.commit();
        session.close();
        System.out.println("Delete " + device);
    }
}
