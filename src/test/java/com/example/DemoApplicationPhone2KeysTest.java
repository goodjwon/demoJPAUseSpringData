package com.example;

import com.example.phone.PhoneRepository;
import com.example.phone2keys.MemberPhone2Keys;
import com.example.phone2keys.MemberPhone2KeysRepository;
import com.example.phone2keys.MemberPhoneKey;
import com.example.phone2keys.Phone2Keys;
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
public class DemoApplicationPhone2KeysTest {

    @Autowired
    MemberPhone2KeysRepository  memberPhone2KeysRepository ;
    @Autowired PhoneRepository phoneRepository;

    @Test
    public void contextLoads() {
    }

    @Test // 1:n 관계 저장 테스트
    public void testPhoneMemberSave(){

        //1. 메인 객체를 생성한다.
        //2. 메인 객체에 필요한 하위 정보를 셋팅 한다. (생성자를 통하지 않아도 된다.)
        //3. 영속으로 저장한다.

        //복합키 테스트
        MemberPhone2Keys memberPhone2Keys = new MemberPhone2Keys(new MemberPhoneKey( 3L,"박정원" ));

        memberPhone2Keys.addPhone(new Phone2Keys(memberPhone2Keys, "01079294577"));
        memberPhone2Keys.addPhone(new Phone2Keys(memberPhone2Keys, "01079294578"));
        memberPhone2Keys.addPhone(new Phone2Keys(memberPhone2Keys, "01079294579"));
        memberPhone2Keys.addPhone(new Phone2Keys(memberPhone2Keys, "01079294570"));

        memberPhone2KeysRepository.save(memberPhone2Keys);
    }

}
