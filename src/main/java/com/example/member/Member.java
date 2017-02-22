package com.example.member;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
import javax.persistence.*;

@Entity
@Table(name = "member")
public class Member {

    @EmbeddedId
    private MemberPK id;

    @Column
    private int age;

    public Member() {}

    public Member(MemberPK id, int age) {
        this.id = id;
        this.age = age;
    }
}
