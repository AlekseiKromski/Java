/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import cmd_classes.Help;
import java.util.Scanner;

/**
 *
 * @author ShinSais
 */
public class App {

    public App() {
        Scanner s = new Scanner(System.in);
        Help help = new Help();
        System.out.println("CMD>> Hi, my name is CMD v.0.1!");
        do{
            System.out.print("CMD>> ");
            String userCommand = s.nextLine();
            if(userCommand.equals("help") || userCommand.equals("Help")){
                help.viewInfo(); //Выводит информацию для помощи
            }else if(userCommand.equals("exit")){
                break;
            }else{
                System.out.println("wrong command"); 
            }
        }while(true);
        System.out.println("CMD>> End programm.");
    }
    
    
}
