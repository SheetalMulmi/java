package org.example.models;

public class Book_taken {
    Book Book;

    public Book_taken(org.example.models.Book book) {
        Book = book;
    }

    public org.example.models.Book getBook() {
        return Book;
    }

    public void setBook(org.example.models.Book book) {
        Book = book;
    }
}
