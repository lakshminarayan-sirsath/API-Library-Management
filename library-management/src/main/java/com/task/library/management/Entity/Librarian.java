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
@Table(name = "librarian")
public class Librarian {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "librarian_id")
	private Integer librarianId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private Integer phone;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role; // (e.g., Admin, Assistant)
	
	@Column(name = "date_hired")
	private LocalDate dateHired;
	
}
