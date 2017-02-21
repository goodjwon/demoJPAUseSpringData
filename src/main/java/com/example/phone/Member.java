package com.example.phone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
@Entity
public class Member {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memId;
    @Column(name = "name", length = 100)
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Collection<Phone> phones;

    public Member() {
    }

    public Member(String name) {
        this.name = name;
    }

    public void addPhone(Phone p){
        if(p == null){
            phones = new ArrayList();
        }
        phones.add(p);
    }

    
}
