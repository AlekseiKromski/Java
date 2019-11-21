/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println("Консольная библеотека");
        Book b1 = new Book("Witcher","Sapkovsky", 2010, "1234");
        Reader r1 = new Reader("Nikita", "Sapkovsky",30,8,2002, "+37246489156");
        b1.printData();
        r1.printData();
    }
    
}
