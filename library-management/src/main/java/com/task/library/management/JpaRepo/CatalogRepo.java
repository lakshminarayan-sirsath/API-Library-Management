package com.task.library.management.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.library.management.Entity.Catalog;

public interface CatalogRepo extends JpaRepository<Catalog, Integer>{

}
