package com.example.phone;

import javax.persistence.*;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
@Entity
public class Phone {
    @Id
    @Column(name="seq")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int seq;

    @Column(name="member_id")
    private int memberId;

    @Column(name="no")
    private String no;

    public Phone() {}
    public Phone(String no){
        this.no = no;
    }
}
