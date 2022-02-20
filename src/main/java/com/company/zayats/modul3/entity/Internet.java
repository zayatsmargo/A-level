package com.company.zayats.modul3.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.math.BigDecimal;

@ToString(callSuper = true)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Internet extends Activity {
    protected BigDecimal traffic;
    protected String ip;
}
