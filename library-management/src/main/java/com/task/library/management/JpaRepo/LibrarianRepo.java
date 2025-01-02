package com.task.library.management.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.library.management.Entity.Librarian;

public interface LibrarianRepo extends JpaRepository<Librarian, Integer> {

}
