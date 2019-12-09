/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Melnikov
 */
public class Book implements Serializable{
    private String name;
    private String author;
    private int publishedYear;
    private String isbn;
    
    public Book(){
    }

    public Book(String name, String author, int publishedYear, String isbn) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
    }
    

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", publishedYear=" + publishedYear + ", isbn=" + isbn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.author);
        hash = 61 * hash + this.publishedYear;
        hash = 61 * hash + Objects.hashCode(this.isbn);
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
        if (this.publishedYear != other.publishedYear) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }
    
    
    
}
