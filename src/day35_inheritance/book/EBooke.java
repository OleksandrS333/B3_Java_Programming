package day35_inheritance.book;

public class EBooke extends Book {

    double size; // 5mgb
    int pages;


    public void read () {
        System.out.println("Reading a digital copy of " + title);
    }

}