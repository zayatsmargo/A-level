package com.company.zayats.modul3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "activities")
@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public abstract class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_id")
    protected Long id;

    @NonNull
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sender_id")
    protected Subscriber sender;

    @NonNull
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "equipment_id")
    protected Equipment equipment;
}
