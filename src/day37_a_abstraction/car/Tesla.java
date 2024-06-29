package day37_a_abstraction.car;
// CONCRETE class = Non-Abstract class
public class Tesla extends ElectricCar {

    public Tesla() {
        super();
    }
    public void start () {
        System.out.println("Star with the card");
    }

    public void charge(){
        System.out.println("Tesla charging");
    }
}