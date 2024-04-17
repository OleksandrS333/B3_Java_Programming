package day05_variables;

public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple";
        String model = "Iphone 14 Pro";
        String color = "Red";
        double price = 799.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from " + brand);
        System.out.println("It came in the color " + color + " and it has " + storage + " GB");
        System.out.println("For the sim type " + sim + " with a camera: " + hasCamera + ", the total price is $" + price);


        String fullMessage = ("I have an " + model + " from " + brand +". \nIt came in the color " + color + " and it has " + storage + " GB. \nFor the sim type " + sim + " a camera: " + hasCamera + ", the total price is $price");

        System.out.println(fullMessage);
//        int intNum = 100;
//        int _string = 123;
//        int Public = 10;
//        int long = 123;
//        int $double = 12;

//       float a = 100.123_123f;
//       byte b = (byte)a;
//       double c = b;
//        System.out.println(c);


//        int i = 100;
//        double d = 123;
//        float f = 300;
//
//        i = f;
//        f = i;
//        d = f;
//        f = d;
//        d = i;
//        i = d;
        System.out.println("5 + 2 = " + 3 + 4);
        System.out.println("5 + 2 = " + (3 + 4));

    }


    }


