/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import java.util.Scanner;
import myclasses.Reader;

/**
 *
 * @author ShinSais
 */
public class ReaderProvider {
    public static Reader createReader(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите имя читателя: ");
        String readerFname = s.nextLine();
        System.out.print("Введите фамилию читателя: ");
        String readerLname = s.nextLine();
        System.out.print("Введите день рождения читателя: ");
        int readerDay = s.nextInt();
        System.out.print("Введите месяц рождения читателя: ");
        int readerMount = s.nextInt();
        System.out.print("Введите год рождения читателя: ");
        int readerYear = s.nextInt();
        String enter = s.nextLine();
        System.out.print("Введите номер тел. читателя: ");
        String readerNumber = s.nextLine();
        Reader r = new Reader(readerFname,readerLname,readerDay,readerMount,readerYear,readerNumber);
        return r;
    }
}
