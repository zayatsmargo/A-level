package com.company.zayats.hw25;

import com.company.zayats.hw25.entity.Film;
import com.company.zayats.hw25.entity.SessionFilm;
import com.company.zayats.hw25.entity.Ticket;
import com.company.zayats.hw25.entity.Users;
import com.company.zayats.hw25.repository.MethodsToAdd;
import com.company.zayats.hw25.repository.MethodsToGet;
import com.sun.jmx.mbeanserver.Repository;

import javax.security.auth.login.Configuration;
import java.sql.Date;

public class HibernateRunner {
    public static void main(String[] args){
        Users user1 = MethodsToAdd.addUser("Alexei", Date.valueOf("2001-11-27"));
        Film film1 = MethodsToAdd.addFilm("Spider-Man", Date.valueOf("2021-12-16"));
        SessionFilm sessionFilm1 = MethodsToAdd.addSessionFilm(36, 3, film1);
        Ticket ticket1 = MethodsToAdd.addTicket(sessionFilm1, user1, Date.valueOf("2022-01-20"), 7);
        MethodsToGet.getUsers();
        MethodsToGet.getFilmName("Spider-Man");
        MethodsToGet.getSessionFilms();
        MethodsToGet.getTicketList(user1);
        MethodsToAdd.deleteTickets(ticket1);
    }
}
