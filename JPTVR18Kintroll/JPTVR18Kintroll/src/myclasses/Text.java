/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Text {
    
    public void run(){
        Scanner s = new Scanner(System.in);
        //Создаем массив из значений
        String text = "The quick brown fox jumps over the lazy dog";
        text = text.replaceAll("\\s+","");
        text = text.toLowerCase();
        char[] wordChars = text.toCharArray();
        
        System.out.print("Введите фразу: ");
        String phrase = s.nextLine();
        text = phrase.replaceAll("\\s+","");
        text = phrase.toLowerCase();
        char[] wordCharsUser = phrase.toCharArray();
        HashSet hashSet = new HashSet();
        for(int i = 0; i < wordCharsUser.length; i++){
            hashSet.add(wordCharsUser[i]);
        }
        int n = hashSet.size();
        if(n <= 26){
            System.out.println("Не все символы");
        }else{
            System.out.println("Все символы");
        }
        
        
    }
}
