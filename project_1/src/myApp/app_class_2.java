package myApp;

import java.util.Scanner;

public class app_class_2 {


    Scanner s = new Scanner(System.in);

    public void getFiveNumbers(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }

    public void getFiveNumbersReverse(){
        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }

    public void multiplicationTable3(){
        //Таблица умножения на 3
        for(int i = 1; i <= 10; i++ ){
            System.out.println(3  + " * " + i + " = " + 3 * i);
        }
    }

    public void getSumm(){
        System.out.print("Enter number: ");
        int user_number = this.s.nextInt();
        int result = 0;
        for (int i = 1; i <= user_number; i++){
            result = result + i;
        }
        System.out.println("Summ is: " + result);
    }

    public void getSumm2(){
        int result = 7;
        while(result <= 98 ){
            System.out.println(result);
            result = result + 7;
        }
    }

    public void getSumm3(){
        int a = 1;
        while(a <= 512){
            System.out.print(a + " ");
            a*=2;
        }
    }

    public void cellandmore(){
        float num = 5.25f;


        int floor = (int) Math.floor(num);
        int cell = (int) Math.ceil(num);
        System.out.println(Math.round(num));
        System.out.println(floor);
        System.out.println(cell);
    }
}
