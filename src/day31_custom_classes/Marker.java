package day31_custom_classes;

public class Marker {
    String type;
    String brand;
    String color;
    public Marker(String inputType, String inputBrand, String inputColor) {
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }

    @Override
    public String toString() {
        return "Marker" +
                "\ntype " + type  +
                "\nbrand " + brand +
                "\ncolor " + color;
    }
}
