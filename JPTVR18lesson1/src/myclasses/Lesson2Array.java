package myclasses;

import java.util.Random;

/*
 * Урок по массивам
 */

/**
 *
 * @author pupil
 */
public class Lesson2Array {
    public void run(){
        Random r = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = r.nextInt(100);
            System.out.printf("%5d", numbers[i]);
        }
        System.out.println("");
        int max = numbers[1];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Масимальное число = " + max);
    } 
    
    public void array(){
        Random r = new Random();
        int[] numbers = new int[100];
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            count++;
            numbers[i] = r.nextInt(100);
            switch(count){
                case 10:
                    System.out.printf("%5d\n", numbers[i]);
                    count = 0;
                    break;
                default:
                    System.out.printf("%5d", numbers[i]);
            }
        }
        System.out.println("");
        int max = 0;
        int min = numbers[1];
        int average = 0;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }else if( numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] == max || numbers[i] == min){
                average+=numbers[i];
            }
        }
        average = average / numbers.length;
        System.out.println("Масимальное число = " + max);
        System.out.println("Миниальное число = " + min);
        System.out.println("Среднее арефметическое = " + average);
    } 
}
