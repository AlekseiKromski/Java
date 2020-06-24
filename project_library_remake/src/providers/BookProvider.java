package providers;

import enitity.Book;

import java.util.Scanner;

public class BookProvider {

    public static Book addBook(Scanner s){
        System.out.print("Enter book name: ");
        String br = s.nextLine();
        String book_name = s.nextLine();
        System.out.print("Enter book author name: ");
        String book_author = s.nextLine();
        System.out.print("Enter date: ");
        String book_date = s.nextLine();
        System.out.print("Enter book iban: ");
        int book_iban = s.nextInt();
        Book book = new Book(book_name,book_author,book_date,book_iban);
        return book;
    }
}
