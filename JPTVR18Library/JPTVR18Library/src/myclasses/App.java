/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private Book book;
    private Reader reader;
    private History hp;
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.println("Консольная библеотека");
        /*
        Book b1 = new Book("Witcher","Sapkovsky", 2010, "1234");
        Reader r1 = new Reader("Nikita", "Sapkovsky",30,8,2002, "+37246489156");
        History h1 = new History(new Date(),null,b1,r1);
        b1.printData();
        r1.printData();
        System.out.println(h1.toString()); //with toStr
        */
        do {
            System.out.println("Выберите задачу");
            System.out.println("1 - Новая книга");
            System.out.println("2 - Список книг");
            System.out.println("3 - Зарегестрировать чит.");
            System.out.println("4 - Выдать книгу");
            System.out.println("5 - Вернуть");
            System.out.println("99 - Стоп");
            int userTask = s.nextInt();
            if(userTask == 1){
                //Create book
                BookProvider bp = new BookProvider();
                this.book = bp.createBook();
            }else if(userTask == 2){
                //List book
                
            }else if(userTask == 3){
                //Register book
                BookProvider bp = new BookProvider();
                this.reader = bp.createReader();
            }else if(userTask == 4){
                //Give book
                HistoryProvider hp = new HistoryProvider();
                this.hp = hp.giveBook(book, reader);
            }else if(userTask == 5){
                // Return book
                HistoryProvider hp = new HistoryProvider();
                this.hp = hp.returnBook(this.hp);
            }else if(userTask == 99){
                //Close program
                break;
            }else{
                System.out.println("Ошибка!");
            }
        } while (true);
        
        
        
        
        
    }
    
}
