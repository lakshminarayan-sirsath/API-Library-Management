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
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Integer bookId;
	
	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;
	
	@Column(name = "publisher")
	private String publisher;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "edition")
	private String edition;
	
	@Column(name = "shelf")
	private String shelf;
	
	@Column(name = "status")
	private String status; // (e.g., Available, Issued, Reserved)
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "date_added")
	private LocalDate dateAdded;
}
