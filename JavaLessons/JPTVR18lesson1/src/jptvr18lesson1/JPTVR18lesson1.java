/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18lesson1;

import myclasses.Lesson2Array;
import myclasses.Lesson2Array;
import java.util.Scanner;
import myclasses.App;
import myclasses.Task2;
import myclasses.Task3;
import myclasses.Task4;
import myclasses.Task5;

/**
 *
 * @author pupil
 */
public class JPTVR18lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Выбери задание:");
        System.out.println("1 - Перевод едениц температуры");
        System.out.println("2 - Разложение на множетели");
        System.out.println("3 - Таблица умножения");
        System.out.println("4 - Год китайского календаря");
        System.out.println("5 - Казино");
        System.out.println("6 - Lesson2Array");
        System.out.println("99 - Выход");
        do{  
            System.out.print("programm >> ");
            int user = s.nextInt();
            if(user == 1){
                App app = new App();
                app.run();  
            }else if(user == 2){
                Task2 task2 = new Task2();
                task2.run();
            }else if(user == 3){
                Task3 task3 = new Task3();
                task3.run();
            }else if(user == 4){
                Task4 task4 = new Task4();
                task4.run();
            }else if(user == 5){
                Task5 task5 = new Task5();
                task5.run();
            }else if(user == 6){
                Lesson2Array Lesson2Array = new Lesson2Array();
                Lesson2Array.array1();
            }else if(user == 99){
                break;
            }else{
                System.out.println("Нету такой комманды");
            }
            
        }while(true);
    }
    
    
}

