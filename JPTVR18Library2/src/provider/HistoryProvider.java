/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import myclasses.Book;
import myclasses.History;
import myclasses.Reader;

/**
 *
 * @author ShinSais
 */
public class HistoryProvider {
    public static History giveBook(ArrayList<Book> books, ArrayList<Reader> readers ){
        Scanner s = new Scanner(System.in);
        System.out.println("Выбери книгу: ");
        int i = 0;
        for(Book book : books){
            System.out.println(i + " " + "Название книги: " + book.getName());
            i++;
        }
        System.out.print("giveBook>> ");
        int userChoiseBook = s.nextInt();
        System.out.println("Выбери польз.: ");
        i = 0;
        for(Reader reader : readers){
            System.out.println(i + " " + "Название книги: " + reader.getFname() + " " + reader.getLname() );
            i++;
        }
        System.out.print("giveBook>> ");
        int userChoiseReader = s.nextInt();
        
        History h = new History(new Date(), null, books.get(userChoiseBook), readers.get(userChoiseReader));
        return h;
    }
    public static void returnBook(ArrayList<History> histories){
        Scanner s = new Scanner(System.in);
        System.out.println("Выбери историю: ");
        int i = 0;
        for(History history : histories){
            System.out.println(i + " История: " + history);
        }
        System.out.print("returnBook>> ");
        int userHistory = s.nextInt();
        histories.get(userHistory).setReturnOfDate(new Date());
    }
}
