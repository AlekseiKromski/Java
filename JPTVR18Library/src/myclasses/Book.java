package myclasses;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Book implements Serializable{
    private String name;
    private String author;
    private int publisherYear;
    private String isbn;
    
    //Для вывода информации о книге
    public void printData(){
        System.out.println(this.name + " " + this.author + " " + this.publisherYear + " " + this.isbn);
    }
    
    //system methods
    public Book(){
        
    }

    public Book(String name, String author, int publisherYear, String isbn) {
        this.name = name;
        this.author = author;
        this.publisherYear = publisherYear;
        this.isbn = isbn;
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

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.author);
        hash = 37 * hash + this.publisherYear;
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
        if (this.publisherYear != other.publisherYear) {
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

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", publisherYear=" + publisherYear + ", isbn=" + isbn + '}';
    }
    
    
}
