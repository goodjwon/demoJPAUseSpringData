package com.example.phone2keys;

import com.example.phone.MemberPhone;

import javax.persistence.*;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
@Entity
public class Phone2Keys {
    @Id
    @Column(name="seq")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int seq;

    @Column(name="no")
    private String no;

    @ManyToOne(targetEntity = MemberPhone2Keys.class ,optional = false)
    private MemberPhone2Keys memberPhone2Keys;

    public Phone2Keys() {}
    public Phone2Keys(MemberPhone2Keys memberPhone2Keys, String no){
        this.no = no;
        this.memberPhone2Keys = memberPhone2Keys;
    }
}
