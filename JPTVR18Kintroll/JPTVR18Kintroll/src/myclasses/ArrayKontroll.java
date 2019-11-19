/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ArrayKontroll {
    public void run(){
        Scanner s = new Scanner(System.in);
        int[][] temp = new int[13][];
        Random rnd = new Random();
        temp[0] = new int[31];
        temp[1] = new int[29];
        temp[2] = new int[31];
        temp[3] = new int[30];
        temp[4] = new int[31];
        temp[5] = new int[31];
        temp[6] = new int[30];
        temp[7] = new int[31];
        temp[8] = new int[30];
        temp[9] = new int[31];
        temp[10] = new int[31];
        temp[11] = new int[30];
        temp[12] = new int[31];
        for(int i = 0; i < temp.length; i++){
            if(i == 0 || i == 1 || i == 2){
                if(temp[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        temp[i][j] = rnd.nextInt(14 - (-12 + 1)) + (-12);
                    }      
                }else if(temp[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        temp[i][j] = rnd.nextInt(14 - (-12 + 1)) + (-12);
                    } 
                }else if(temp[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        temp[i][j] = rnd.nextInt(14 - (-12 + 1)) + (-12);
                    } 
                }
            }else if(i == 3 || i == 4 || i == 5){
                if(temp[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        temp[i][j] = rnd.nextInt(21 - (5 + 1)) + 5;
                    }      
                }else if(temp[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        temp[i][j] = rnd.nextInt(21 - (5 + 1)) + 5;
                    } 
                }else if(temp[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        temp[i][j] = rnd.nextInt(21 - (5 + 1)) + 5;
                    } 
                } 
            }else if(i == 6 || i == 7 || i == 8){
                if(temp[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        temp[i][j] = rnd.nextInt(25 - (11 + 1)) + 11;
                    }      
                }else if(temp[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        temp[i][j] = rnd.nextInt(25 - (11 + 1)) + 11;
                    } 
                }else if(temp[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        temp[i][j] = rnd.nextInt(25 - (11 + 1)) + 11;
                    } 
                } 
            }else if(i == 9 || i == 10 || i == 11 || i == 12){
                if(temp[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        temp[i][j] = rnd.nextInt(12 - (0 + 1)) + 0;
                    }      
                }else if(temp[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        temp[i][j] = rnd.nextInt(6 - (-1 + 1)) + (-1);
                    } 
                }else if(temp[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        temp[i][j] = rnd.nextInt(5 - (-3 + 1)) + (-3);
                    } 
                } 
            }
        }
        
        
        System.out.print("Введите месяц: ");
        int mount = s.nextInt();
        System.out.print("Введите день: ");
        int day = s.nextInt();
        
        for(int i = 0; i < temp.length; i++){
            if(i == mount){
                if(temp[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        if(j == day){
                            System.out.println("Температура: " + temp[i][j]);
                        }
                    }      
                }else if(temp[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        if(j == day){
                            System.out.println("Температура: " + temp[i][j]);
                        }
                    } 
                }else if(temp[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        if(j == day){
                            System.out.println("Температура: " + temp[i][j]);
                        }
                    } 
                }  
            }
        }
        
        int max = 0;
        int min = 100;        
        for(int i = 0; i < temp.length; i++){
            if(i == mount){
                if(temp[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        if(temp[i][j] > max){
                            max = temp[i][j];
                        }
                        if(temp[i][j] < min){
                            min = temp[i][j];
                        }
                    }      
                }else if(temp[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        if(temp[i][j] > max){
                            max = temp[i][j];
                        }
                        if(temp[i][j] < min){
                            min = temp[i][j];
                        }
                    } 
                }else if(temp[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        if(temp[i][j] > max){
                            max = temp[i][j];
                        }
                        if(temp[i][j] < min){
                            min = temp[i][j];
                        }
                    } 
                }  
            }
        }  
        
        System.out.println("Самая высокая температура: " + max);
        System.out.println("Самая низкая температура: " + min);
        
        int avr = 0;
        for(int i = 0; i < temp.length; i++){
            System.out.println("Месяц: " + i);
            if(temp[i].length == 30){
                for(int j = 0; j < 30; j++){
                    avr = avr + temp[i][j];
                }   
                avr = avr / 30;
                System.out.println("Среднее ареф.: " + avr);
            }else if(temp[i].length == 29){
                for(int j = 0; j < 29; j++){
                    avr = avr + temp[i][j];
                }
                avr = avr / 29;
                System.out.println("Среднее ареф.: " + avr);
            }else if(temp[i].length == 31){
                for(int j = 0; j < 31; j++){
                    avr = avr + temp[i][j]; 
                } 
                avr = avr / 31;
                System.out.println("Среднее ареф.: " + avr);
            }
        }
        
    }
}
