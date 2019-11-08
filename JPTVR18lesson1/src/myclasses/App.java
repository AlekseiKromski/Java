/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        
            System.out.println("Привет, Юрий Мельников");
            Scanner scanner = new Scanner(System.in);
        do{
            Random random = new Random();
            int randomNumber = random.nextInt(5); // NextInt генерирует в диапозоне
            System.out.println("Загадай число от 1 до 4");
            int userNumber = scanner.nextInt();
            if(userNumber == randomNumber){
               System.out.println("Ты угадал!");
               break;
            }else{
                System.out.println("Не повезло, правильное число = " + randomNumber);
            }
        }while(true);
    }
    
}
