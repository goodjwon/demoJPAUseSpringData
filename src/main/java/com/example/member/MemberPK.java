package com.example.member;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
@Embeddable
public class MemberPK implements Serializable {

    @Column(name = "memberId", nullable = false, length = 12)
    private String id;
    @Column(name = "userName", nullable = false, length = 12)
    private String name;

    public MemberPK() {
    }

    public MemberPK(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
