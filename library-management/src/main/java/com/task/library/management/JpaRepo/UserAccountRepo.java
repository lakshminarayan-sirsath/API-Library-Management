package com.task.library.management.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.library.management.Entity.UserAccount;

public interface UserAccountRepo extends JpaRepository<UserAccount, Integer>{

}
