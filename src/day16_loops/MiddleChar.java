package day16_loops;

import java.util.Scanner;

public class MiddleChar {

    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);

        String sen = key.next();
        String even = "";
        if (sen.length() %2 == 0) {
            even = sen.substring(sen.length()/2 -1, sen.length()/2 +1);
            System.out.println(even);
        } else if (sen.length() %2 == 1) {
            even = sen.substring(sen.length()/2, sen.length()/2 +1);
            System.out.println(even);
        }

    }

}
