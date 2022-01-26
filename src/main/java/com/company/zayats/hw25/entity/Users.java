package com.company.zayats.hw25.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Column
    private String name;
    @Column
    private Date dateOfBirth;
    @OneToMany(mappedBy = "users")
    private List<Ticket> ticketList = new ArrayList<>();

    public Users() {
    }

    public Users(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
