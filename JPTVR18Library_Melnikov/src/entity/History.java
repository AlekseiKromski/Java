/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Melnikov
 */
public class History implements Serializable{
    private Date giveOfDate;
    private Date returnOfDate;
    private Book book;
    private Reader reader;

    public History() {
    }

    public History(Date giveOfDate, Date returnOfDate, Book book, Reader reader) {
        this.giveOfDate = giveOfDate;
        this.returnOfDate = returnOfDate;
        this.book = book;
        this.reader = reader;
    }

    public Date getGiveOfDate() {
        return giveOfDate;
    }

    public void setGiveOfDate(Date giveOfDate) {
        this.giveOfDate = giveOfDate;
    }

    public Date getReturnOfDate() {
        return returnOfDate;
    }

    public void setReturnOfDate(Date returnOfDate) {
        this.returnOfDate = returnOfDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "History{" 
                + "giveOfDate=" + giveOfDate 
                + ", returnOfDate=" + returnOfDate 
                + ", book=" + book.getName()
                + ", " + book.getAuthor()
                + ", reader=" + reader.getName()
                + " " + reader.getSurname()
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.giveOfDate);
        hash = 59 * hash + Objects.hashCode(this.returnOfDate);
        hash = 59 * hash + Objects.hashCode(this.book);
        hash = 59 * hash + Objects.hashCode(this.reader);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.giveOfDate, other.giveOfDate)) {
            return false;
        }
        if (!Objects.equals(this.returnOfDate, other.returnOfDate)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        return true;
    }
    
}
