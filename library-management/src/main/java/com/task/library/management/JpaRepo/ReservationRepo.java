package com.task.library.management.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.library.management.Entity.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Integer>{

}
