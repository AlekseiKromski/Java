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
public class Task4 {
    public void run(){ 
        Scanner s = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = s.nextInt();
        int colorYear = year % 10; 
        int animalYear = (year + 8) % 12;    
        String color = "none";
        switch(colorYear){
            case 0:case 1:
                color = "белый";
                break;
            case 2:case 3:
                color = "черный";
                break;
            case 4:case 5:
                color = "зелёный";
                break;
            case 6:case 7:
                color = "красный";
                break;
            case 8:case 9:
                color = "желтый";       
                break;
        }
        String animal = "none";
        switch(animalYear ){
            //кейсы по животным
            // animal = "животное";
            case 0:
                animal = "Крысы";
                break;
            case 1:
                animal = "Коровы";
                break;
            case 2:
                animal = "Тигры";
                break;
            case 3:
                animal = "Зайца";
                break;
            case 4:
                animal = "Дракона";
                break;
            case 5:
                animal = "Змеи";
                break;
            case 6:
                animal = "Лошади";
                break;
            case 7:
                animal = "Овцы";
                break;
            case 8:
                animal = "Обезьяны";
                break;
            case 9:
                animal = "Курицы";
                break;
            case 10:
                animal = "Собаки";
                break;
            case 11:
                animal = "Свиньи";
                break;
        }
        System.out.println("Год: " + animal + ", " + color);
    }
}
