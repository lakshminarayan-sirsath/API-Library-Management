package com.task.library.management.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "user_account")
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private Integer accountId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "last_login")
	private LocalDate lastLogin; // @@@@@@@@@@@@@@@@
	
	@Column(name = "status")
	private String status; // (e.g., Active, Locked)
	
	@Column(name = "role")
	private String role; // (e.g., Member, Admin)
	
	// MemberID (Foreign Key)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "member_id") // it can be null, until it will become a member.
	private Member member;


}
