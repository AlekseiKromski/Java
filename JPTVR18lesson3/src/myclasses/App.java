package myclasses;

public class App {
    public void run(){
        Author author = new Author("Sapkovsky","none");
        Book book2 = new Book("Withcer",author.getAuthorName(),"none",1234);
        System.out.println("Name of book: " + book2.getBookName());
        System.out.println("Name of author: " + book2.getBookAuthor());


    }
}
