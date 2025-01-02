package com.task.library.management.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.library.management.Entity.BorrowingRecord;

public interface BorrowingRecordRepo extends JpaRepository<BorrowingRecord, Integer>{

}
