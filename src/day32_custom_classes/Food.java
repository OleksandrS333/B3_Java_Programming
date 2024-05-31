package day32_custom_classes;
/*
    create a class called Food

       - data:

           name, quantity, unit price, total price
*/
/*
    - constructor

        - create a constructor that creates a Food object with the name

        - create a constructor that creates a Food object with the name and quantity

        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here
*/
/*
    - method:

        - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

        - toString()
            print all the Food information

*/
public class Food {
    // INSTANCE VARIABLES
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;


    public Food (String name) {
        this.name = name;
    }

    public Food (String name, int quantity){
        this (name);
        this.quantity = quantity;
    }


    public Food (String name, int quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }


    public void calculatePrice () {
        //totalPrice = Math.round(unitPrice * quantity);
        totalPrice = unitPrice * quantity;
    }

    public String toString() {
        return "Item: " + name + " - " + quantity + " x " + unitPrice + " = $"
                + totalPrice;
    }


}