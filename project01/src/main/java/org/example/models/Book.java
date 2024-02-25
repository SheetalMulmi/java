package org.example.models;

import java.util.Date;
import java.util.List;

public class Book {
    String bname;
    Date date;
    List<Book_taken> booktaken;

    public Book(String bname, Date date, List<Book_taken> booktaken) {
        this.bname = bname;
        this.date = date;
        this.booktaken = booktaken;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Book_taken> getBooktaken() {
        return booktaken;
    }

    public void setBooktaken(List<Book_taken> booktaken) {
        this.booktaken = booktaken;
    }
}
