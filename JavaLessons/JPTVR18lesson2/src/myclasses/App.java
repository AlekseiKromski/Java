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

    public void run() {
        Author author1 = new Author();
        author1.setName("Ilja Sedoc");
        author1.setDate(2002);    
        Author author2 = new Author("Denis Sedov",2001);
        String Author = author1.getName();
        Book book1 = new Book("My book", Author, "this is my book", "1234", 2000);

        System.out.println(book1.getNameBook());
    }
    
}
