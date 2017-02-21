package com.example.member;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by goodjwon on 2017. 2. 21..
 */
public interface MemberRepository extends CrudRepository<Member, Long> {
}
