package day32_custom_classes;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        Food food1 = new Food("Apple");
        System.out.println(food1);


        System.out.println();
        Food food2 = new Food( "Chips", 2);
        System.out.println(food2);
        food2.unitPrice = 1.99;
        System.out.println(food2);
        food2.calculatePrice();
        System.out.println(food2);


        System.out.println();
        Food food3 = new Food("Chicken", 3, 5.99);
        System.out.println(food3);


        System.out.println();
        food1.quantity = 10;
        food1.unitPrice = 2.99;
        System.out.println(food1);
        food1.calculatePrice();
        System.out.println(food1);


        System.out.println("-------------------------");
        String str1 = new String("one");
        String str2 = new String("two");
        String str3 = new String("three");
        String [] arr = {"one", "two", "three"}; // Created Array of String - Storing String objects
        String [] arr2 = {str1, str2, str3};


        Food [] allFood = {food1, food2, food3, null}; // I stored Food objects into Array of Food
        System.out.println( allFood[2] );

        // How can I check how many elements I have in this Food array
        System.out.println("I have total " + allFood.length + " different foods.");
        System.out.println(allFood[3]);
        allFood[3] = new Food("Fish", 4, 2.5);
        System.out.println(allFood[3]);


        System.out.println("=============================");
        for ( Food each : allFood) {
            System.out.println(each);
        }


        // Can calculate what will be my total cost for all foods
        double totalPriceForAll = 0;
        for ( Food each : allFood){
            totalPriceForAll += each.totalPrice;
        }
        System.out.println("Total Price for all foods: " + totalPriceForAll);


        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(Arrays.toString(allFood));


        System.out.println("*******************************");
        // Find the food which has the total price more than $10
        for ( Food each : allFood){
            if (each.totalPrice > 10){
                System.out.println(each.name);
            }
        }

    }
}
