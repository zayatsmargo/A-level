package com.company.zayats.modul3.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Table(name = "equipments")
@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_id")
    protected Long id;

    @NonNull
    @ManyToMany(mappedBy = "equipments")
    @ToString.Exclude
    protected List<Subscriber> subscribers;
    protected String model;
}
