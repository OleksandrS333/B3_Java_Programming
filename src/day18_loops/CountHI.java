package day18_loops;

public class CountHI {
    public static void main(String[] args) {
        String str = "aaaahiaaahhhiaahi";
        int count = 0;
        for (int index = 0; index < str.length()-1; index++) {
           if (str.charAt(index) == 'h' && str.charAt(index+1) == 'i'){
               count++;
            }

        }
        System.out.println(count);
    }

}
