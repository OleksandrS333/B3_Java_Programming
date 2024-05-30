package day31_custom_classes;

public class Carpet {

    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;


    public Carpet (boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice) {
        isPersian = inputPersian;
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculatePrice();

    }


    public void calculatePrice () {
        totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }


    @Override
    public String toString() {
        return "Carpet Info" +
                "\n\tWidth: " + width +
                "\n\tLength: " + length +
                "\n\tPersian: " + isPersian +
                "\n\tUnit Price: $" + unitPrice +
                "\n\tTotal Price: $" + totalPrice;
    }
}