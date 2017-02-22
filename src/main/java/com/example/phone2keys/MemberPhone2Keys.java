package com.example.phone2keys;

import com.example.phone.Phone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
@Entity
@Table(name = "member_phone_2keys")
public class MemberPhone2Keys {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memId;
    @Column(name = "name", length = 100)
    private String name;

    //복합키 테스트
    @EmbeddedId
    MemberPhoneKey memberPhoneKey;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "memberPhone")
    private Collection<Phone2Keys> phone2Keys;

    public MemberPhone2Keys() {
    }

    // 복합키 테스트
    // 생성자 객체 생성시에만 실행 된다.
    public MemberPhone2Keys(MemberPhoneKey memberPhoneKey) {
        this.memberPhoneKey = memberPhoneKey;
    }

    //주력 상태 변경 관련 기능
    public void addPhone(Phone2Keys p){
        if(phone2Keys == null){
            phone2Keys = new ArrayList<Phone2Keys>();
        }
        phone2Keys.add(p);
    }

    
}
