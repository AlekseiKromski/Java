/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import java.util.Scanner;
import myclasses.Book;

/**
 *
 * @author ShinSais
 */
public class BookProvider {

    public static Book createBook(){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String bookName = s.nextLine();
        System.out.print("Введите автора книги: ");
        String bookAuthor = s.nextLine();
        System.out.print("Введите дату публикации книги: ");
        int bookPublicYear = s.nextInt();
        String enter = s.nextLine();
        System.out.print("Введите isbn книги: ");
        String bookIsbn= s.nextLine();
        
        Book b = new Book(bookName, bookAuthor, bookPublicYear,bookIsbn);
        return b;
    }
}
