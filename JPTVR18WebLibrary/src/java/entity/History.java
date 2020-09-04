/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pupil
 */
@Entity
public class History implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal (TemporalType.TIMESTAMP)
    private Date giveOfDate;
    @Temporal (TemporalType.TIMESTAMP)
    private Date returnOfDate;
    @OneToOne
    private Book book;
    @OneToOne
    private Reader reader;

    public History() {
    }

    public History(Long id, Date giveOfDate, Date returnOfDate, Book book, Reader reader) {
        this.id = id;
        this.giveOfDate = giveOfDate;
        this.returnOfDate = returnOfDate;
        this.book = book;
        this.reader = reader;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
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

    @Override
    public String toString() {
        return "History{" + "id=" + id + ", giveOfDate=" + giveOfDate + ", returnOfDate=" + returnOfDate + ", book=" + book + ", reader=" + reader + '}';
    }

    
    
}