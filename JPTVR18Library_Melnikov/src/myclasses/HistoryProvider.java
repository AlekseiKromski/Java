/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class HistoryProvider {
    private Scanner scanner = new Scanner(System.in);
    public History takeOnBook(ArrayList<Book> books, ArrayList<Reader> readers, ArrayList<History>histories){
        HashSet<Book> setBooks = new HashSet<>();
        int counterPrintedBooks = 0;
        System.out.println("Список книг: ");
        boolean flag = true;
        for (int i = 0; i < books.size(); i++) {
            for(History history: histories){
                if(history.getBook().equals(books.get(i)) 
                        && history.getReturnOfDate()== null){
                    flag = false;
                    break;
                }
            }
            if(flag){
                setBooks.add(books.get(i));
            }
            flag=true;
            if(setBooks.contains(books.get(i))){
                System.out.println(i+1+". "+books.get(i).toString());
                counterPrintedBooks++;
            }
        }
        if(counterPrintedBooks == 0){
            System.out.println("Все книги выданы.");
            return null;
        }
        System.out.println("Выберите книгу: ");
        int indexBook = scanner.nextInt();
        Book book = books.get(indexBook-1);
        System.out.println("Список читателей: ");
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);
            System.out.println(i+1+". " + reader.toString());
        }
        System.out.println("Выберите читателя: ");
        int indexReader = scanner.nextInt();
        Reader reader = readers.get(indexReader-1);
        History history = new History(new Date(), null, book, reader);
//        History history = new History();
//        history.setBook(book);
//        history.setReader(reader);
//        history.setGiveOfDate(new Date());
        return history;
    }

    public void returnBook(ArrayList<History> histories) {
        System.out.println("---- Возврат книги ----");
        System.out.println("Список историй:");
        for (int i = 0; i < histories.size(); i++) {
            History history = histories.get(i);
            if(history.getReturnOfDate()==null){
               System.out.println(i+". Читатель "+history.getReader().getName()
                        +" "+history.getReader().getSurname()
                        +" читает книгу: "
                        + history.getBook().getName()
                ); 
            }
        }
        System.out.println("Выберите нужный номер истории");
        int numHistory = scanner.nextInt();
        History history = histories.get(numHistory);
        history.setReturnOfDate(new Date());
    }
}
