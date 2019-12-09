/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class BookProvider {
    public Book createBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Создание книги ---");
        System.out.println("Название книги:");
        String name = scanner.nextLine();
        System.out.println("Автор книги:");
        String author = scanner.nextLine();
        System.out.println("Год издания:");
        int publishedYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ISBN идентификатор книги:");
        String isbn = scanner.nextLine();
        Book book = new Book(name, author, publishedYear, isbn);
        return book;
    }
}
