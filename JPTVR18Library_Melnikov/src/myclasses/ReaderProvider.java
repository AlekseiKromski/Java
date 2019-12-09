/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class ReaderProvider {
    public Reader createReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Создание читателя ----");
        System.out.println("Имя читателя: ");
        String name = scanner.nextLine();
        System.out.println("Фамилия читателя: ");
        String surname = scanner.nextLine();
        System.out.println("День рождения: ");
        int day  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Месяц рождения: ");
        int month  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Год рождения: ");
        int year  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Телефон читателя: ");
        String phone = scanner.nextLine();
        
        Reader reader = new Reader(name, surname, day, month, year, phone);

        return reader;
    }
}
