package com.company.zayats.modul3.repository;

import com.company.zayats.hw24.HibernateUtil;
import com.company.zayats.modul3.entity.Subscriber;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.math.BigInteger;
import java.util.*;

public class ActivityRepository {

    public Map<Subscriber, Long> getTopFiveConsumersOfActivity(String activity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Map<Subscriber, Long> subscribes = new LinkedHashMap<>();
        Query query = session.createQuery("select a.sender, count(a.sender) as c " +
                        "from Activity as a " +
                        "where a.class = :activity " +
                        "group by a.sender " +
                        "order by count(a.sender) desc")
                .setMaxResults(5)
                .setParameter("activity", activity);
        for(Iterator iterator = query.iterate(); iterator.hasNext();) {
            Object[] row = (Object[]) iterator.next();
            subscribes.put((Subscriber) row[0], (Long) row[1]);
        }
        transaction.commit();
        session.close();
        return subscribes;
    }


    public String getMostPopularActivity() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<BigInteger> countsServices = session.createSQLQuery("select count(*) " +
                        "from activities where dtype = 'Call' " +
                        "union " +
                        "select count(*) from activities where dtype = 'Message' " +
                        "union " +
                        "select count(*) from activities where dtype = 'Internet'")
                .list();
        transaction.commit();
        session.close();
        int calls = countsServices.get(0).intValue();
        int sms = countsServices.get(1).intValue();
        int internet = countsServices.get(2).intValue();

        if (calls > sms && calls > internet) {
            return "Most popular service: Calls";
        } else if (sms > calls && sms > internet) {
            return "Most popular service: SMS";
        } else
            return "Most popular service: Internet";
    }
}
