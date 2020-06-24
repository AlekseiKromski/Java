package enitity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable {

    String name;
    String author;
    String date;
    int iban;

    public Book(String name, String author, String date, int iban) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + this.name + '\'' +
                ", author='" + this.author + '\'' +
                ", date='" + this.date + '\'' +
                ", iban=" + this.iban +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return iban == book.iban &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(date, book.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, date, iban);
    }
}
