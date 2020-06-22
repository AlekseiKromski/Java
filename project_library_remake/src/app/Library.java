package app;

import java.util.Scanner;

public class Library {


    //custom colors
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    //Backgorund
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    //application fileds
    Scanner s = new Scanner(System.in);
    Boolean run = true;

    String[] books;

    public void library(){
        while(this.run){
            System.out.println(this.BLACK + this.YELLOW_BACKGROUND + "1 - List of books" + this.RESET);
            System.out.println(this.BLACK + this.GREEN_BACKGROUND + "2 - Add book" + this.RESET);
            System.out.println(this.BLACK + this.RED_BACKGROUND + "3 - Delete book" + this.RESET);
            System.out.println(this.BLACK + this.WHITE_BACKGROUND + "0 - Exit" + this.RESET);

            //Ask the user's task
            System.out.print("Eneter your task> ");
            int user_task = this.s.nextInt();
            switch(user_task){
                case 0:
                    this.run = false;
                    break;
                case 1:
                    for (String book : this.books){
                        System.out.println(book);
                    }
                    break;

                default:
                    System.out.println(this.RED + "==================" + this.RESET);
                    System.out.println(this.RED + "YOUR TASK IS WRONG" + this.RESET);
                    System.out.println(this.RED + "==================" + this.RESET);
                    break;
            }


        }

    }

}
