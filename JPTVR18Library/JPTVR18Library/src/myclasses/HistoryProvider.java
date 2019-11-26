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
public class HistoryProvider {
    
    public History giveBook(ArrayList<Book> books, ArrayList<Reader> readers){
        Scanner s = new Scanner(System.in);
        System.out.println("Список книг: ");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + book.toString());
        }
        System.out.print("Выберите книгу: ");
        int userBook = s.nextInt();
        System.out.println("Список читателей: ");
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);
            System.out.println(i + reader.toString());
        }
        System.out.print("Выберите читателея: ");
        int userReader = s.nextInt();
        History h = new History(new Date(), null, books.get(userBook), readers.get(userReader));
        return h;
    }
    
    public ArrayList<History> returnBook(ArrayList<History> hp){
        //hp.setReturnOfDate(new Date());
        return hp;
    }
}
