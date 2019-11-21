/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookProvider {
    public Book createBook(){
        Scanner s = new Scanner(System.in);
        
        //input data
        System.out.print("Введите название книги: ");
        String nameBook = s.nextLine();
        System.out.print("Введите автора книги: ");
        String authorBook = s.nextLine();
        System.out.print("Введите год выпуска книги: ");
        int yearPublisherBook = s.nextInt();
        System.out.print("Введите isbn книги: ");
        String isbnBook = s.nextLine();
        
        //create new book
        Book b = new Book(nameBook, authorBook,yearPublisherBook,isbnBook);
        String enter = s.nextLine();
        return b;
    }
}
