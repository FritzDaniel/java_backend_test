package com.crud.backend.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "author")
    private String author;
    
    @Column(name = "publisher")
    private String publisher;
    
    @Column(name = "releaseDate")
    private Date releaseDate;
    
    @Column(name = "pageCount")
    private int pageCount;

    @Column(name = "status", columnDefinition = "int default 0")
    private int status;

    @Column(name = "borrower", nullable = true)
    private String borrower;

    @Column(name = "borrowDate", nullable = true) 
    private Date borrowDate;

    @Column(name = "returnDate", nullable = true)
    private Date returnDate;
    
    // Constructors, Getters, and Setters

    public Book() {

    }

    // Constructors

    public Book(String title, String author, String publisher, Date releaseDate, int pageCount,
        int status, String borrower, Date borrowDate, Date returnDate) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.releaseDate = releaseDate;
            this.pageCount = pageCount;
            this.status = status;
            this.borrower = borrower;
            this.borrowDate = borrowDate;
            this.returnDate = returnDate;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getStatus() {
        return status;
    }

    public String getBorrower() {
        return borrower;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
