package com.task.library.management.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private Integer reservationId;
	
	@Column(name = "reservation_date")
	private LocalDate reservationDate;
	
	@Column(name = "status")
	private String status; // (e.g., Pending, Canceled, Completed)
	
	// BookID (Foreign Key)
	// deleting reservation will not delete book.
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
	          CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id", nullable = false)
	private Book book;
	
	// MemberID (Foreign Key)
	// deleting reservation will not member book.
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
		      CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", nullable = false)
	private Member member;
}
