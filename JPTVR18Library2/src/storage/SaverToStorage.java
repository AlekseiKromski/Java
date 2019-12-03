/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class SaverToStorage {
    public void saveBooks(ArrayList<Book> books){
        FileOutputStream fileOutoutStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutoutStream = new FileOutputStream("Books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutoutStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Нету файла Book", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка записи Books", ex);
        }finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    } 
    
    public void readeBook(){
        FileOutputStream fileOutoutStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutoutStream = new FileOutputStream("Books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutoutStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Нету файла Book", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "none", ex);
        } 
    }
}
