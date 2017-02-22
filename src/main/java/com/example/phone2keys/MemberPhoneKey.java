package com.example.phone2keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by goodjwon on 2017-02-23.
 */

//복합키 테스트
//@Embeddable
public class MemberPhoneKey implements Serializable {

    @Column(name = "id")
    private Long memId;
    @Column(name = "name", length = 100)
    private String name;

    public MemberPhoneKey() {
    }

    public MemberPhoneKey(Long memId, String name) {
        this.memId = memId;
        this.name = name;
    }
}
