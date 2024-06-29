package day18_loops;

import java.util.Scanner;

public class CountHI {
    public static void main(String[] args) {
//        String str = "aaaahiaaahhhiaahi";
//        int count = 0;
//        for (int index = 0; index < str.length()-1; index++) {
//           if (str.charAt(index) == 'h' && str.charAt(index+1) == 'i'){
//               count++;
//            }
//
//        }
//        System.out.println(count);


        Scanner scan = new Scanner (System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)== str.charAt(i+2)) {
                count++;
            }

        }
        System.out.println(count);
//        String str = scan.next();
//        int count = 0 ;
//        //WRITE YOUR CODE HERE
//        for (int i = 0; i < str.length()-1; i++) {
//            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)== str.charAt(i+2)) {
//                count++;
//            }
//
//        }
//        System.out.println(count);
    }

}
