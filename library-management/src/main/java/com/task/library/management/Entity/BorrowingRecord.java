package com.task.library.management.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "borrowing_record")
public class BorrowingRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "record_id")
	private Integer recordId;
	
	@Column(name = "issue_date")
	private LocalDate issueDate;
	
	@Column(name = "due_date")
	private LocalDate dueDate;
	
	@Column(name = "return_date")
	private LocalDate returnDate;
	
	@Column(name = "fine_amount")
	private Integer fineAmount;
	
	@Column(name = "status")
	private String status; // (e.g., Borrowed, Returned, Overdue)
	
	
	// BookID (Foreign Key)
	// MemberID (Foreign Key)

}
