package com.task.library.management.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.library.management.Entity.Member;

public interface MemberRepo extends JpaRepository<Member, Integer> {

}
