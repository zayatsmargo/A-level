package com.company.zayats.hw25.repository;

import com.company.zayats.hw25.HibernateUtil;
import com.company.zayats.hw25.entity.Film;
import com.company.zayats.hw25.entity.SessionFilm;
import com.company.zayats.hw25.entity.Ticket;
import com.company.zayats.hw25.entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;


public class MethodsToAdd {
    public static SessionFilm addSessionFilm(Integer numberOfSeats, Integer roomNumber, Film film) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        SessionFilm sessionFilm = new SessionFilm(numberOfSeats, roomNumber, film);
        session.save(sessionFilm);
        transaction.commit();
        session.close();
        return sessionFilm;
    }
    public static Ticket addTicket(SessionFilm sessionFilm, Users users, Date dateOfPurchase, Integer placeNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Ticket ticket = new Ticket(sessionFilm, users, dateOfPurchase, placeNumber);
        session.save(ticket);
        transaction.commit();
        session.close();
        return ticket;
    }
    public static Film addFilm(String title, Date releaseDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Film film = new Film(title, releaseDate);
        session.save(film);
        transaction.commit();
        session.close();
        return film;
    }
    public static Users addUser(String name, Date dateOfBirth) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Users users = new Users(name, dateOfBirth);
        session.save(users);
        transaction.commit();
        session.close();
        return users;
    }

    public static void deleteTickets(Ticket ticket) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(ticket);
        transaction.commit();
        session.close();
        System.out.println("Delete " + ticket);
    }
}
