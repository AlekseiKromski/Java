package myApp;

public class app_class_3 {

    String str = "I love java programming language";
    String str2 = "   I love java programming language   ";

    public void charsetAt(){
        char b1 = this.str.charAt(7);
        System.out.println(b1);
    }

    public void substr(){
        System.out.println(this.str.substring(1));
        System.out.println(this.str.substring(0,9));
    }

    public void trim(){
        System.out.println(this.str2.trim());
    }

    public void endsWith(){
        System.out.println(this.str.endsWith("ge"));
    }
}
