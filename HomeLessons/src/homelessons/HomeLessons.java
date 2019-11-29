package homelessons;

public class HomeLessons {

    public static void main(String[] args) {
        //Создаем массив
        String[][] array = new String[3][3];
        
        //Заполняем массива значениями
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= 2; j++) {
                array[i][j] = "test" + i + "." + j;
            }
        }
        
        //Выводим массив
        for(String[] i : array){
            for(String j : i){
                System.out.println(j);
            }
        }
        
    }
}
