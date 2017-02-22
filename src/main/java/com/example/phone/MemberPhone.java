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

//복합키 테스트
//    @EmbeddedId
//    MemberPhoneKey memberPhoneKey;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "memberPhone")
    private Collection<Phone> phones;

    public MemberPhone() {
    }

//복합키 테스트
//    public MemberPhone(MemberPhoneKey memberPhoneKey) {
//        this.memberPhoneKey = memberPhoneKey;
//    }

    // 생성자 객체 생성시에만 실행 된다.
    public MemberPhone(String name) {
        this.name = name;
        this.phones = phones;
    }

    //주력 상태 변경 관련 기능
    public void addPhone(Phone p){
        if(phones == null){
            phones = new ArrayList<Phone>();
        }
        phones.add(p);
    }

    
}
