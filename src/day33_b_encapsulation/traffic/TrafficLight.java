package day33_b_encapsulation.traffic;

public class TrafficLight {

    private String color;

    public TrafficLight (String color) {
       setColor(color);
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        switch (color) {
            case "yellow":
            case "red":
            case "green":
                this.color = color;
        }
    }
}
