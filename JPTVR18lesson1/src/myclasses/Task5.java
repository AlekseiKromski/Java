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
public class Task5 {
    public void run() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 100; //100 первых очков 
        do {
            if(score <= 0){
                System.out.println("Ты проиграл!!");
                break;
            }else{
                int randomNumber = random.nextInt(5); // NextInt генерирует в диапозоне
                System.out.println("Задумано число от 0 до 4. Угадай?"); // Игра
                int userNumber = scanner.nextInt();
                if (userNumber == randomNumber) {   
                    score+=50;
                    System.out.println("Ты угадал, молодец!");
                    System.out.println("Ты получил 50 очков. Твой счет = " + score);
                }
                else {
                    score-=20;
                    System.out.println("Не повезло : (, задумано число: "+randomNumber);
                    System.out.println("С твоего счета снято 20 очков. Твой счет = " + score);
                }
            }
        }while(true);
    }
}
