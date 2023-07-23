package com.crud.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.backend.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Find books by Status
    List<Book> findByStatus(int status);
}
