package com.haydikodlayalim.pagination.model.repo;

import com.haydikodlayalim.pagination.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
