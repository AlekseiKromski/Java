/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;
import provider.BookProvider;
import provider.ReaderProvider;

/**
 *
 * @author ShinSais
 */
public class App {
    
    private Book book;
    private Reader reader;
    
    public void run(){
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Выберите действие");
            System.out.println("1 - Добавить книг.");
            System.out.println("2 - Добавить чит.");
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
                System.out.println(this.reader.toString());
            }
        } while (true);
        
        
    }
}
