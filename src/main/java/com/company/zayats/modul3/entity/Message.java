package com.company.zayats.modul3.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message extends Activity {

    @NonNull
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "receiver_id")
    protected Subscriber receiver;

    @Column(name = "content_message")
    protected String contentMessage;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", sender=" + sender +
                ", equipment=" + equipment.id +
                ", receiver=" + receiver.id +
                ", contentSms='" + contentMessage + '\'' +
                '}';
    }
}
