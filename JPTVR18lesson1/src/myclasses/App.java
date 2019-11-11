
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.print("1 - в фаренг., 2 - в цельсий : ");
        int tmp = s.nextInt();
        if(tmp == 1){
            System.out.print("Введите температуру по фаренг. : ");
            int tf = s.nextInt();
            int answer = (tf - 32 ) * 5/9;
            System.out.println("Ответ: " + answer); 
        } else if(tmp == 2){         
            System.out.print("Введите температуру по цельсию : ");
            int tc = s.nextInt();
            int answer = (tc * 9/5) + 32;
            System.out.println("Ответ: " + answer);
        }
    }
}

