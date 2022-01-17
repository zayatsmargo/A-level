package com.company.zayats.hw25.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "film_id", nullable = false)
    private Integer idFilm;
    @Column
    private String title;
    @Column
    private Date releaseDate;

    public Film(String title, Date releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public Film() {
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
