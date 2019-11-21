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
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.println("Консольная библеотека");
        /*
        Book b1 = new Book("Witcher","Sapkovsky", 2010, "1234");
        Reader r1 = new Reader("Nikita", "Sapkovsky",30,8,2002, "+37246489156");
        History h1 = new History(new Date(),null,b1,r1);
        b1.printData();
        r1.printData();
        System.out.println(h1.toString()); //with toSr
        */
        System.out.println("Выберите задачу");
        System.out.print("1 - Новая книга");
        System.out.print("2 - Список книг");
        System.out.print("3 - Зарегестрировать чит.");
        System.out.print("4 - Выдать книгу");
        System.out.print("5 - Вернуть");
        int userTask = s.nextInt();
        do {
            if(userTask == 1){
                //create book
            
            }else if(userTask == 2){
                //List book

            }else if(userTask == 3){
                //Register book

            }else if(userTask == 4){
                //Give book

            }else if(userTask == 5){
                // Return book

            }else if(userTask == 99){
                //Close program
                break;
            }else{
                System.out.println("Ошибка!");
            }
        } while (true);
        
        
        
        
        
    }
    
}
