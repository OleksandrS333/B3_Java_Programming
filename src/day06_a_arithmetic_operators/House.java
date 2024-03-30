package day06_a_arithmetic_operators;


/*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */



public class House {

    public static void main(String[] args) {

        String houseType = "Penthouse";
        String fullAddress = " 12345 Test ST";

        int numOfBedrooms = 4;
        int numOfKitchen = 2;
        int numOfBathroom = 3;
        int zipCope = 54321;

        double costOfHouse = 999_999.00;
        double schoolRating = 4.9;

        boolean hasPark = true;
        boolean hasBasement = false;
        boolean hasPool = true;
        boolean hasAttic = false;
        boolean isOnSale = false;

        String houseInfo = "The " + houseType + " on " + fullAddress + ", " + zipCope + " costs $" + costOfHouse + "\n\tThe " + houseType + " has the attic: " + hasAttic + ", \n\thas a pool: " + hasPool + " \n\tis on sale: " + isOnSale + ", \n\thas a park: " + hasPark + ". The schools in the are have a rating of " + schoolRating;


    }




}
