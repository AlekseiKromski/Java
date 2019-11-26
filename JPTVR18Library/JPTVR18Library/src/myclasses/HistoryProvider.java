/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    
    public History giveBook(ArrayList<book>, ArrayList<reader>){
        History h = new History(new Date(), null, book, reader);
        return h;
    }
    
    public History returnBook(History hp){
        hp.setReturnOfDate(new Date());
        return hp;
    }
}
