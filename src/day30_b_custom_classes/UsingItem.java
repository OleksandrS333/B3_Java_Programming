package day30_b_custom_classes;

public class UsingItem {

    public static void main(String[] args) {

        Item item1 = new Item();

        item1.name = "Apples";
        item1.price = 4.99;

        System.out.println(item1);

        Item item2 = new Item();

        item2.name = "Tomato";
        item2.price = 10.99;

        System.out.println(item2);

    }
}
