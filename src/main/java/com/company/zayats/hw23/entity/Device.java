package com.company.zayats.hw23.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class Device {
    private long deviceId;
    private String type;
    private String modelName;
    private int price;
    private Date dateOfCreation;
    private String description;
    private boolean stockAvailability;
    private long factoryId;
}
