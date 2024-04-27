package day18_loops;

/*
        java is java -- 12 - 3 = 9
        012345678901

        java -- length(); - 4
        0123
 */
public class CountJava {
    public static void main(String[] args) {

        String str = "java is a java language java";
        int countJava = 0;

        for (int i = 0; i <= str.length() - 4; i++) {

            String everyFour = str.substring(i, i+4);

            if (everyFour.equals("java")){
                countJava++;
            }

        }

        System.out.println(countJava);


    }

}