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
 * @author ShinSais
 */
public class Task3 {
    
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    
    public void run(){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int points = 0;
        for(int i = 1; i <= 5; i++){
            int a = r.nextInt(11);
            int b = r.nextInt(11);
            System.out.print( a + " * " + b + " = ");
            int answer = s.nextInt();
            if(answer == a * b){
                System.out.println(ANSI_GREEN + "Ты ответил правильно!" + ANSI_GREEN);
                points++;
            }else{
                System.out.println(ANSI_RED + "Ты ответил не правильно!" + ANSI_RED);
            }
        }
        System.out.println("Коль.-во правельных ответов : " + points);
        if(points == 5){
            System.out.println("Молодец!");
        }else if(points == 4 || points == 3){
            System.out.println("Надо бы еще поучить!");
        }else if(points <= 2){
            System.out.println("Срочно нужно учить таблицу умножения!");
        }
            
        
    }
}
