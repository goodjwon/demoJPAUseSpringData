package com.example;


import com.example.member.Member;
import com.example.member.MemberRepository;
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
public class DemoMemberApplicationTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testMemberSave(){

        Member member = new Member("jwon",42);

        memberRepository.save(member);
    }
}
