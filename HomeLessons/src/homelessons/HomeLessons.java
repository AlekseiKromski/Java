package homelessons;

import java.util.Arrays;

public class HomeLessons {

    public static void main(String[] args) {
        int[] n = {1,2,3}; //Одномерный массив
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}}; //Двумерный массив
        //Перебор массива и его элементов
        for(int i = 0; i <= 2; i++){
            System.out.println("Сейчас ипользуется эдемент: " + Arrays.toString(m[i]));
            System.out.print("Его элементы: ");
            for(int z = 0; z <= 2; z++){
                System.out.print(m[i][z] + ", ");
                if(z == 2){
                    System.out.println("");
                }
            } 
        }
    }
    
}
