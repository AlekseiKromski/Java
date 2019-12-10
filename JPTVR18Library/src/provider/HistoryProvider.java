/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import myclasses.Book;
import myclasses.History;
import myclasses.Reader;

/**
 *
 * @author ShinSais
 */
public class HistoryProvider {
    public static History giveBook(ArrayList<Book> books, ArrayList<Reader> readers, ArrayList<History> histories ){
        Scanner s = new Scanner(System.in);
        System.out.println("Выбери книгу: ");
        
        HashSet<Book> setBooks = new HashSet<>();
        int counterPrintedBooks = 0;
        boolean flag = true;
        for (int i = 0; i < books.size(); i++) {
            for(History history: histories){
                if(history.getBook().equals(books.get(i)) && history.getReturnOfDate()== null){
                    flag = false;
                    break;
                }
            }
            if(flag){
                setBooks.add(books.get(i));
            }
            flag=true;
            if(setBooks.contains(books.get(i))){
                System.out.println(i+". "+books.get(i).toString());
                counterPrintedBooks++;
            }
        }
        if(counterPrintedBooks == 0){
            System.out.println("Все книги выданы.");
            History h = new History();
            return h;
        }
        System.out.print("giveBook>> ");
        int userChoiseBook = s.nextInt();
        System.out.println("Выбери польз.: ");
        int k = 0;
        for(Reader reader : readers){
            System.out.println(k + " " + "Название книги: " + reader.getFname() + " " + reader.getLname() );
            k++;
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
        int countPrint = 0;
        for(History history : histories){
            if(history.getReturnOfDate() == null){
                System.out.println(i + " История: " + history);
                countPrint++;
            }
            i++;
        }
        if(countPrint != 0){
            System.out.print("returnBook>> ");
            int userHistory = s.nextInt();
            histories.get(userHistory).setReturnOfDate(new Date()); 
        }
        
    }
}
