package com.company.zayats.hw25.repository;

import com.company.zayats.hw25.HibernateUtil;
import com.company.zayats.hw25.entity.Film;
import com.company.zayats.hw25.entity.SessionFilm;
import com.company.zayats.hw25.entity.Ticket;
import com.company.zayats.hw25.entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class MethodsToGet {
    public static void getSessionFilms() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<SessionFilm> usersQuery = session.createQuery("from SessionFilm ", SessionFilm.class);
        List<SessionFilm> sessionFilmList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Session Films list: " + sessionFilmList.toString());
    }
    public static void getUsers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Users> usersQuery = session.createQuery("from Users ", Users.class);
        List<Users> usersList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Users list: " + usersList.toString());
    }
    public static void getFilmName(String string) {
        string = "%" + string + "%";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Film> usersQuery = session.createQuery("from Film WHERE title LIKE :title", Film.class);
        usersQuery.setParameter("title", string);
        List<Film> filmList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Films where name like by " + string.replace("%", "") + ": " + filmList.toString());
    }

    public static void getTicketList(Users users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Ticket> usersQuery = session.createQuery("from Ticket where users =:UsersID", Ticket.class);
        usersQuery.setParameter("UsersID", users);
        List<Ticket> ticketList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Ticket list user id " + users.getUserId() + ": " + ticketList.toString());
    }
}

