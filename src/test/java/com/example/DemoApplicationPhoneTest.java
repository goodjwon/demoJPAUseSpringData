package com.example;

import com.example.phone.MemberPhone;
import com.example.phone.MemberPhoneRepository;
import com.example.phone.Phone;
import com.example.phone.PhoneRepository;
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
    @Autowired PhoneRepository phoneRepository;

    @Test
    public void contextLoads() {
    }

    @Test // 1:n 관계 저장 테스트
    public void testPhoneMemberSave(){

        MemberPhone memberPhone = new MemberPhone("박정원");

        memberPhone.addPhone(new Phone(memberPhone, "01079294577"));
        memberPhone.addPhone(new Phone(memberPhone, "01079294578"));
        memberPhone.addPhone(new Phone(memberPhone, "01079294579"));
        memberPhone.addPhone(new Phone(memberPhone, "01079294570"));

        memberPhoneRepository.save(memberPhone);
    }

}
