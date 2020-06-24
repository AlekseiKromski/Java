package save;

import enitity.Book;

import java.io.*;
import java.util.ArrayList;

public class saveToFile {

    public void saveToFile(ArrayList<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(books);
        objectOutputStream.close();
    }

    public ArrayList<Book> uploadIntoFile(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("books.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Book> books = null;
        try {
            books = (ArrayList<Book>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }
}
