package com.crud.backend.services;

import org.springframework.stereotype.Service;

import com.crud.backend.models.Book;
import com.crud.backend.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findBooksByStatus(int status) {
        return bookRepository.findByStatus(status);
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> existingBook = bookRepository.findById(id);
        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPublisher(updatedBook.getPublisher());
            book.setReleaseDate(updatedBook.getReleaseDate());
            book.setPageCount(updatedBook.getPageCount());
            return bookRepository.save(book);
        }
        return null;
    }

    public Book updateBorrower(Long id, Book updatedBook) {
         Optional<Book> existingBook = bookRepository.findById(id);
        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setStatus(updatedBook.getStatus());
            book.setBorrower(updatedBook.getBorrower());
            book.setBorrowDate(updatedBook.getBorrowDate());
            book.setReturnDate(updatedBook.getReturnDate());
            return bookRepository.save(book);
        }
        return null;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}