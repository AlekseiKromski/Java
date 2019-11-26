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
public class App {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();
    private ArrayList<History> hp = new ArrayList<>();
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
            System.out.println("1 - Новая книга");//+
            System.out.println("2 - Список книг");//+
            System.out.println("3 - Зарегестрировать чит.");//+
            System.out.println("4 - Выдать книгу");//-
            System.out.println("5 - Вернуть");//-
            System.out.println("6 - Список выданных книг");//+
            System.out.println("7 - Список читателей");//+
            System.out.println("99 - Стоп");
            int userTask = s.nextInt();
            if(userTask == 1){
                //Create book
                BookProvider bp = new BookProvider();
                this.books.add(bp.createBook());
            }else if(userTask == 2){
                //List book
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).toString());
                }
            }else if(userTask == 3){
                //Register book
                BookProvider bp = new BookProvider();
                this.readers.add(bp.createReader());
            }else if(userTask == 4){
                //Give book
                HistoryProvider hp = new HistoryProvider();
                this.hp.add(hp.giveBook(books, readers));
            }else if(userTask == 5){
                // Return book
                HistoryProvider hp = new HistoryProvider();
                hp.returnBook(this.hp);
            }else if(userTask == 6){
                for (int i = 0; i < hp.size(); i++) {
                    History h = hp.get(i);
                    System.out.println("Пользователь: " + h.getReader() + "/ Читает: " + h.getBook());
                }
            }else if(userTask == 7){
                for (int i = 0; i < readers.size(); i++) {
                    System.out.println(readers.get(i).toString());
                }
            }else if(userTask == 99){
                //Close program
                break;
            }else{
                System.out.println("Ошибка!");
            }
        } while (true);
        
        
        
        
        
    }
    
}
