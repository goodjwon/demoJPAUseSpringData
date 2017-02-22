package com.example.phone;

import com.example.member.Member;

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

    @Column(name="no")
    private String no;

    @ManyToOne(targetEntity = MemberPhone.class ,optional = false)
    private MemberPhone memberPhone;

    public Phone() {}
    public Phone(MemberPhone memberPhone, String no){
        this.no = no;
        this.memberPhone = memberPhone;
    }
}
