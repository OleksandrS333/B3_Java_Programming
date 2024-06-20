package day40_exception.learn_exc;

public class Fourth {
    public static void main(String[] args) {

        try {
            System.out.println("Start");
            Thread.sleep(-200);  // IllegalArgumentException
            System.out.println("End");
        } catch (Exception e){
            System.out.println(e.getMessage());
            //System.out.println(e.getMessage());
        }


        System.out.println("END-2");


    }
}