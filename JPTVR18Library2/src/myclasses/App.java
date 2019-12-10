/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import provider.BookProvider;
import provider.HistoryProvider;
import provider.ReaderProvider;
import storage.SaveFileToStorage;

/**
 *
 * @author ShinSais
 */
public class App {
    
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();
    private ArrayList<History> histories = new ArrayList<>();
    
    public App(){
        this.books.addAll(SaveFileToStorage.readFileBooks());
        this.readers.addAll(SaveFileToStorage.readFileReader());
        this.histories.addAll(SaveFileToStorage.readFileHistory());
    }
    
    public void checkHistory(){
        History history = null;
        for (int i = 0; i < histories.size(); i++) {
            history = histories.get(i);
            if(history.getGiveOfDate() == null && history.getReturnOfDate() == null && history.getBook() == null && history.getReader() == null){
                histories.remove(history);
            }
        }
    } 
    
    public void run() throws IOException{
        Scanner s = new Scanner(System.in);
        do {
            this.checkHistory();
            System.out.println("Выберите действие");
            System.out.println("1 - Добавить книг.");
            System.out.println("2 - Добавить чит.");
            System.out.println("3 - Выдать книгу");
            System.out.println("4 - Вернуть книгу");
            System.out.println("5 - Список книг");
            System.out.println("6 - Список читателей");
            System.out.println("7 - Список выданных книг"); 
            System.out.println("99 - выход");
            System.out.print(">> ");
            int userAction = s.nextInt();
            if(userAction == 99){
                break;
            }else if(userAction == 1){
                //add book
                this.books.add(BookProvider.createBook());
                SaveFileToStorage.saveBooks(this.books);
            }else if(userAction == 2){
                //add reader
                this.readers.add(ReaderProvider.createReader());
                SaveFileToStorage.saveReaders(this.readers);
            }else if(userAction == 3){
                //give book
                this.checkHistory();
                this.histories.add(HistoryProvider.giveBook(this.books, this.readers, this.histories));
                SaveFileToStorage.saveHistory(histories);
            }else if(userAction == 4){
                //return book
                this.checkHistory();
                HistoryProvider.returnBook(histories);
                SaveFileToStorage.saveHistory(histories);
            }else if(userAction == 5){
                //list of Books
                boolean flag = true;
                for (int i = 0; i < books.size(); i++) {
                    for(History history: histories){
                        if(history.getBook().equals(books.get(i)) && history.getReturnOfDate()== null){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println(i+". "+books.get(i).toString());
                    }
                    flag=true; 
                }
            }else if(userAction == 6){
                //list of Reader
                for(Reader reader : readers){
                    System.out.println(reader);
                } 
            }else if(userAction == 7){
                //list of History
                this.checkHistory();
                History history = null;
                for (int i = 0; i < histories.size(); i++) {
                    history = histories.get(i);
                    if(history.getReturnOfDate() == null){
                        System.out.printf("Читатель %s %s читает %s%n",
                            history.getReader().getFname(),
                            history.getReader().getLname(),
                            history.getBook().getName()
                        );
                    }
                }
            }
        }while(true);
    }
}
