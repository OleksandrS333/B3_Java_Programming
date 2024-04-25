package day16_loops;

public class PrintNumbers {

    public static void main(String[] args) {

        int num = 2;

        // print even up until 100

        while (num <= 100) {
            num += 2;
            System.out.println(num);
        }

        int i = 1;

//        while (i <= 100) {
//            if (i % 2 == 1) {
//                i = 2;
//            }
//            i += 2;
//            System.out.println(i);
//        }

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
