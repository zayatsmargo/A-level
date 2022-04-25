package com.company.zayats.modul3.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@ToString(callSuper = true)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Call extends Activity{

    @NonNull
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "receiver_id")
    protected Subscriber receiver;
}
