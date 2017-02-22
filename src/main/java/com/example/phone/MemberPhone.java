package com.example.phone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
@Entity
@Table(name = "member_phone")
public class MemberPhone {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memId;
    @Column(name = "name", length = 100)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "memberPhone")
    private Collection<Phone> phones;

    public MemberPhone() {
    }

    public MemberPhone(String name) {
        this.name = name;
    }

    public void addPhone(Phone p){
        if(phones == null){
            phones = new ArrayList<Phone>();
        }
        phones.add(p);
    }

    
}
