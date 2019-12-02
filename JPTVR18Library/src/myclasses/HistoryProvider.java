/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    
    public History giveBook(ArrayList<Book> books, ArrayList<Reader> readers){
        Scanner s = new Scanner(System.in);
        System.out.println("Список книг: ");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + " " + book.getName());
        }
        System.out.print("Выберите книгу: ");
        int userBook = s.nextInt();
        System.out.println("Список читателей: ");
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);
            System.out.println(i + " Имя: " + reader.getFname() + " Фамилия: " + reader.getLname());
        }
        System.out.print("Выберите читателея: ");
        int userReader = s.nextInt();
        History h = new History(new Date(), null, books.get(userBook), readers.get(userReader));
        return h;
    }
    
    public void returnBook(ArrayList<History> hp){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < hp.size(); i++) {
            History get = hp.get(i);
            System.out.println( i + " " + get.getBook()); 
        }
        int userInt = s.nextInt();
        History get = hp.get(userInt);
        get.setReturnOfDate(new Date());
    }
}
