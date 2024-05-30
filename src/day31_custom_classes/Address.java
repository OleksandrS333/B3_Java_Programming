package day31_custom_classes;

public class Address {

    String street;
    String city;
    String state;
    String zipcode;

//    public Address (String inputStreet, String inputCity, String inputState, String inputZipcode) {
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipcode = inputZipcode;
//    }


    public Address (String street, String city, String state, String zipcode) {
        this.street = street; // Since LOCAL variable and INSTANCE variable have SAME names, Java will prioritize LOCAL variables. To make difference between them, I used "this" keyword
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }


}