package com.example;

import com.example.phone.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationPhoneTest {

    @Autowired MemberPhoneRepository memberPhoneRepository;

    @Test
    public void contextLoads() {
    }

    @Test // 1:n 관계 저장 테스트
    public void testPhoneMemberSave(){

        //1. 메인 객체를 생성한다.
        //2. 메인 객체에 필요한 하위 정보를 셋팅 한다. (생성자를 통하지 않아도 된다.)
        //3. 영속으로 저장한다.

        MemberPhone memberPhone = new MemberPhone("박정원");

        //복합키 테스트
        //MemberPhone memberPhone = new MemberPhone(new MemberPhoneKey( 3L,"박정원" ));

        memberPhone.addPhone(new Phone(memberPhone, "01079294577"));
        memberPhone.addPhone(new Phone(memberPhone, "01079294578"));
        memberPhone.addPhone(new Phone(memberPhone, "01079294579"));
        memberPhone.addPhone(new Phone(memberPhone, "01079294570"));

        memberPhoneRepository.save(memberPhone);
    }

}
