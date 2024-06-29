package day35_inheritance.book;

public class Library {

    public static void main(String[] args) {

        Book obj1 = new Book();
        // obj1. - has access to 5 instance variables of the class


        AudioBook ab1 = new AudioBook();
        //ab1. - has access to 7 instance variable (5 from Parent + 2 from itself) and 1 instance method from itself
        ab1.duration = 100;
        ab1.narrator = "Morgan Freeman";
        ab1.listen();
        ab1.title = "Java is Fun";



        EBooke eb1 = new EBooke();
        //eb1. - has access to 7 instance variable (5 from Parent + 2 from itself) and 1 instance method from itself
        //eb1.duration = 100; //NOT REACHABLE
        eb1.size = 10;
        eb1.pages = 600;
        eb1.title = "Soft Skills";
        eb1.read();
        //eb1.listen(); // NOT REACHABLE


        Author a1 = new Author("jojo moyes", 40);

        Book b1 = new Book();
        //b1. -  has access to 6 instance variables of the class
        b1.author = new Author("Gabriel Garcia Marquez", 80);
        System.out.println(b1.author);


        AudioBook audio1 = new AudioBook();
        audio1.author = new Author("Thomas Jefferson", 70);

        System.out.println( audio1.author.getName()  );



    }


}