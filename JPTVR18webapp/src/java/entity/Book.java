/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class Book implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private String quantityl;
    private String count;
    private int publishYear;
    private String isbn;

    public Book() {
    }

    public Book( String name, String author, String quantityl, String count, int publishYear, String isbn) {
        this.name = name;
        this.author = author;
        this.quantityl = quantityl;
        this.count = count;
        this.publishYear = publishYear;
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuantityl() {
        return quantityl;
    }

    public void setQuantityl(String quantityl) {
        this.quantityl = quantityl;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.author);
        hash = 37 * hash + Objects.hashCode(this.quantityl);
        hash = 37 * hash + Objects.hashCode(this.count);
        hash = 37 * hash + this.publishYear;
        hash = 37 * hash + Objects.hashCode(this.isbn);
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
        final Book other = (Book) obj;
        if (this.publishYear != other.publishYear) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.quantityl, other.quantityl)) {
            return false;
        }
        if (!Objects.equals(this.count, other.count)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + author + ", quantityl=" + quantityl + ", count=" + count + ", publishYear=" + publishYear + ", isbn=" + isbn + '}';
    }

    
    
    
}
