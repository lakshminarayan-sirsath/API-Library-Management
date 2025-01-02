package com.task.library.management.Entity;

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
@Table(name = "catalog")
public class Catalog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "catalog_id")
	private Integer catalogId;
	
	@Column(name = "catalog_id")
	private String category;
	
	@Column(name = "search_keywords")
	private String searchKeywords;
	
	@Column(name = "availability_status")
	private String availabilityStatus;
	
	// BookID (Foreign Key)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id", nullable = false)
	private Book book;

}
