/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Book {
    
    private String nameBook;
    private Author authors;
    private String desc;
    private String isbn; // издание книги 
    private int date;

    public Book() { // конструктор класса 
        
    }

    public Book(String nameBook, Author authors, String desc, String isbn, int date) {
        this.nameBook = nameBook;
        this.authors = authors;
        this.desc = desc;
        this.isbn = isbn;
        this.date = date;
    }

    Book(String my_book, String Author, String this_is_my_book, String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthors() {
        return authors;
    }

    public String getDesc() {
        return desc;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getDate() {
        return date;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nameBook);
        hash = 79 * hash + Objects.hashCode(this.authors);
        hash = 79 * hash + Objects.hashCode(this.desc);
        hash = 79 * hash + Objects.hashCode(this.isbn);
        hash = 79 * hash + this.date;
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
        if (this.date != other.date) {
            return false;
        }
        if (!Objects.equals(this.nameBook, other.nameBook)) {
            return false;
        }
        if (!Objects.equals(this.desc, other.desc)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "nameBook=" + nameBook + ", authors=" + authors + ", desc=" + desc + ", isbn=" + isbn + ", date=" + date + '}';
    }

    
    
    
    

    
    
    
    

    
    
    
}
