package com.company.zayats.modul3.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tariffs")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tariff_id")
    protected Long id;

    @NonNull
    protected BigDecimal price;

    @Column(name = "package_minutes")
    protected Integer packageMinutes;

    @Column(name = "package_internet")
    protected BigDecimal packageInternet;

    @Column(name = "package_message")
    protected Integer packageMessage;

    @Column(name = "is_available_for_all")
    protected boolean isAvailableForAll;

    @OneToMany(mappedBy = "currentTariff", cascade = CascadeType.ALL)
    @ToString.Exclude
    protected List<Subscriber> subscribers;
}
