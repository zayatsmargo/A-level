package com.company.zayats.hw25.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id", nullable = false)
    private Integer idTicket;
    @ManyToOne
    @JoinColumn(name = "session_id")
    private SessionFilm sessionFilm;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @Column
    private Date dateOfPurchase;
    @Column
    private Integer placeNumber;

    public Ticket() {
    }

    public Ticket(SessionFilm sessionFilm, Users users, Date dateOfPurchase, Integer placeNumber) {
        this.sessionFilm = sessionFilm;
        this.users = users;
        this.dateOfPurchase = dateOfPurchase;
        this.placeNumber = placeNumber;
    }
}
