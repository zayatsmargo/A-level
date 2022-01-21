package com.company.zayats.hw24.repository;

import com.company.zayats.hw24.HibernateUtil;
import com.company.zayats.hw24.entity.Device;
import com.company.zayats.hw24.entity.Factory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class MethodsToGet {
    public static void getDeviceId(Integer integer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Device> usersQuery = session.createQuery("from Device where id = :idDevice", Device.class);
        usersQuery.setParameter("idDevice", integer);
        System.out.println(usersQuery.getSingleResult());
        transaction.commit();
        session.close();
    }

    public static void getFactoryId(Integer integer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Factory> usersQuery = session.createQuery("from Factory where id = :factoryId", Factory.class);
        usersQuery.setParameter("factoryId", integer);
        List<Factory> deviceList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Factory list: " + deviceList.toString());
    }

    public static void getAllDevicesFromFactory(Integer integer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Device as device inner join fetch device.factory where device.factory.id = :factoryId");
        query.setParameter("factoryId", integer);
        List deviceList = query.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Factory list (join): " + deviceList.toString());
    }

    public static void getAllDevicesAndSumForFactory() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select d.factory.id, sum(d.price), count (d.id) from Device as d group by d.factory.id order by d.factory.id";
        List<?> list = session.createQuery(hql).list();
        System.out.println("Group by: ");
        for (Object o : list) {
            Object[] row = (Object[]) o;
            System.out.println("Фабрика № " + row[0] + ", Колличесво устройств: " + row[2] + ", сумма всех устройств: " + row[1]);
        }
        session.close();
    }
}
