package com.task.library.management.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.library.management.Entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
