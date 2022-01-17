package com.company.zayats.hw25.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class SessionFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id", nullable = false)
    private Integer idSession;
    @Column
    private Integer numberOfSeats;
    @Column
    private Integer roomNumber;
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    public SessionFilm(Integer numberOfSeats, Integer roomNumber, Film film) {
        this.numberOfSeats = numberOfSeats;
        this.roomNumber = roomNumber;
        this.film = film;
    }

    public SessionFilm() {
    }

    @Override
    public String toString() {
        return "Session{" +
                "numberOfSeats=" + numberOfSeats +
                ", roomNumber=" + roomNumber +
                ", film=" + film +
                '}';
    }
}
