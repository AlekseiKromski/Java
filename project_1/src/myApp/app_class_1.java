package myApp;

import java.util.Scanner;

public class app_class_1 {

    Scanner s;

    public app_class_1() {
        //Make scanner for all application
        this.s = new Scanner(System.in);
    }


    public void sayHelloTo(){
        System.out.print("Enter your name: ");
        String name = this.s.nextLine();
        System.out.print("Hello, " + name);
    }

    public
}
