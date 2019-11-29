/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;
import provider.BookProvider;
import provider.HistoryProvider;
import provider.ReaderProvider;

/**
 *
 * @author ShinSais
 */
public class App {
    
    private Book book = new Book();
    private Reader reader = new Reader();
    private History history = new History();
    
    public void run(){
        Scanner s = new Scanner(System.in);
        do {
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
                this.book = BookProvider.createBook();
            }else if(userAction == 2){
                //add reader
                this.reader = ReaderProvider.createReader();
            }else if(userAction == 3){
                //give book
                this.history = HistoryProvider.giveBook(this.book, this.reader);
            }else if(userAction == 4){
                //return book
                HistoryProvider.returnBook(this.history);
            }else if(userAction == 5){
                //list of Book
                System.out.println(this.book.toString());
            }else if(userAction == 6){
                //list of Reader
                System.out.println(this.reader.toString());
            }else if(userAction == 7){
                //list of History
                System.out.println(this.history.toString());
            }
        }while(true);
        
        
    }
}
