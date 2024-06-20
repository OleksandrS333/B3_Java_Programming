package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(200);// Compile Exception  +  possible RunTimeException

        //If I do not want to handle the COMPILE Exception - I have a chance to AVOID it.
        // I can add the exception into method signature

        test(); // Since we are also ignoring it by main method signature, we are not required to handle COMPILE TIME EXCEPTION in here.


    }

    public static void test () throws InterruptedException {
        Thread.sleep(200);
    }

    public static void test2 ()  {
        try{
            test();
        } catch (Exception e){

        }
        //main();
    }


    public static void test3 () {
        test2();
    }

}