/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import java.util.Date;
import myclasses.Book;
import myclasses.History;
import myclasses.Reader;

/**
 *
 * @author ShinSais
 */
public class HistoryProvider {
    public static History giveBook(Book book, Reader reader){
        History h = new History(new Date(), null, book, reader);
        return h;
    }
    public static void returnBook(History history){
        history.setReturnOfDate(new Date());
    }
}
