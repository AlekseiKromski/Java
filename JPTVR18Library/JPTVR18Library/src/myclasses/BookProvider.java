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
    
    public Reader createReader(){
        Scanner s = new Scanner(System.in);
        
        //input data
        System.out.print("Введите имя пользов.: ");
        String fnameReader = s.nextLine();
        System.out.print("Введите фамилия пользов.: ");
        String lnameReader = s.nextLine();
        System.out.print("Введите день рождения пользов.: ");
        int dayReader = s.nextInt();
        System.out.print("Введите месяц рождения пользов.: ");
        int mounthReader = s.nextInt();
        System.out.print("Введите год рождения пользов.: ");
        int yearReader = s.nextInt();
        System.out.print("Введите номер.телефона пользов.: ");
        String numberReader = s.nextLine();
        String enter = s.nextLine();
        String enter2 = s.nextLine();
        Reader r = new Reader(fnameReader, lnameReader,dayReader,mounthReader,yearReader,numberReader);
        return r;
    }
}
