package day27_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
        String  str = "aP3d572&*jd@jdJU";

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i <str.length(); i++) {

            char each = str.charAt(i);

            if(Character.isUpperCase(each)){
                upper++;
            } else if (Character.isLowerCase(each)){
                lower++;
            } else if (Character.isDigit(each)) {
                digits++;

            } else  {
                others++;
            }

        }
        System.out.println("Uppercase letters count: " + upper);
        System.out.println("Lower letters count: " + lower);
        System.out.println("Digits letters count: " + digits);
        System.out.println("Other letters count: " + others);

    }
}
