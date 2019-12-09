package storage;

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
import myclasses.Book;
import myclasses.History;
import myclasses.Reader;



/**
 *
 * @author Melnikov
 */
public class SaveFileToStorage {

    public static void saveBooks(ArrayList<Book> books) {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("Books.txt"));
            objectOutputStream.writeObject(books);
            objectOutputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static void saveReaders(ArrayList<Reader> reader) {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("Reader.txt"));
            objectOutputStream.writeObject(reader);
            objectOutputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static void saveHistory(ArrayList<History> history) {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("History.txt"));
            objectOutputStream.writeObject(history);
            objectOutputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static Collection<? extends Book> readFileBooks() {
        ArrayList<Book> books = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("Books.txt"));
            books = (ArrayList<Book>) objectInputStream.readObject();  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }
    public static Collection<? extends Reader> readFileReader() {
        ArrayList<Reader> reader = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("Reader.txt"));
            reader = (ArrayList<Reader>) objectInputStream.readObject();  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reader;
    }
    public static Collection<? extends History> readFileHistory() {
        ArrayList<History> history = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("History.txt"));
            history = (ArrayList<History>) objectInputStream.readObject();  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveFileToStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return history;
    }
 
}