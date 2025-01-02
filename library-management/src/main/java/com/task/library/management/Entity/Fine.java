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
	// deleting Fine will not Member.
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", nullable = false)
	private Member member;
	
}
