
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;

/**
 *
 * @author ShinSais
 */
public class Task2 {
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.print("Введи трехзначное число: ");
        int number = s.nextInt();
        int edenici = number % 10; 
        int desatki = (number%100)/10;
        int sotni = (number/10)/10;
        System.out.println("Сотни :" + sotni);
        System.out.println("Десятки :" + desatki);
        System.out.println("Еденицы :" + edenici);

        
    }
    
}
