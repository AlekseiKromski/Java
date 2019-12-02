/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveFileToStorage {
 
    public void saveBooks(ArrayList<Book> books){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Нету файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Не записать файл", ex);
        }
        finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
        }
    }
   
    public void saveReaders(ArrayList<Reader> readers){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Readers.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(readers);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Нету файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Не записать файл", ex);
        }
        finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
        }
    }
    
    public void saveHistory(ArrayList<History> history){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("history.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(history);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Нету файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Не записать файл", ex);
        }
        finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
        }
    }
    
    
    //read
    public Collection<? extends Book> readFileBooks(){
        ArrayList<Book> books = new ArrayList();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream= new FileInputStream("Books.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            books = (ArrayList<Book>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Класс не найден", ex);
        }
        return books;
    }
    
    public Collection<? extends Reader> readFileReader(){
        ArrayList<Reader> reader = new ArrayList();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream= new FileInputStream("Readers.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            reader = (ArrayList<Reader>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Класс не найден", ex);
        }
        return reader;
    }
    
    public Collection<? extends History> readFileHistory(){
        ArrayList<History> history = new ArrayList();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream= new FileInputStream("History.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            history = (ArrayList<History>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, "Класс не найден", ex);
        }
        return history;
    }
}
