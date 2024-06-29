package day33_a_static;

public class Iphone {

    // INSTANCE VARIABLE
    String model;
    double price;


    static String company;
    static String os;
    static boolean appleDay;
    static String day;


    // CUSTOM CONSTRUCTOR
    public Iphone (String model,double price) {
        this.model = model;
        this.price = price;
    }


    // STATIC BLOCK - Static initialization - IT WILL RUN FIRST
    static {
        System.out.println("STATIC BLOCK RUN:");
        company = "Apple";
        os = "IOS";
        //model = "Ip"; //static can ACCEPT ONLY static
        day = "Wednesday";
        if (day.equals("Friday")) {
            appleDay = true;
        }
    }




    // INSTANCE METHOD
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=$" + price +
                '}';

        //"Company" + company; // INSTANCE can ACCEPT both - static and instance
    }
}