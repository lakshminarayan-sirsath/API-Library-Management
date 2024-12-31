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
@Table(name = "fine")
public class Fine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fine_id")
	private Integer fineId;
	
	@Column(name = "amount")
	private Integer amount;
	
	@Column(name = "Paid_status")
	private String paidStatus; // (e.g., Paid, Unpaid)
	
	@Column(name = "due_date")
	private LocalDate dueDate;
	
	@Column(name = "date_impose")
	private LocalDate dateImpose;

	// MemberID (Foreign Key)
	
}
