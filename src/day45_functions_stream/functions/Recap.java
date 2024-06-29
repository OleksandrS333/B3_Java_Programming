package day45_functions_stream.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Recap {













    public static void main(String[] args) {

        Predicate<Integer> verifyDuplicates4 = (number) -> { // 102341

            String numInString = number + ""; // "10213418"
            boolean result = false;
            for (int i = 0; i < numInString.length(); i++) {
                result = Collections.frequency( Arrays.asList((number+"").split("")) , numInString.charAt(i)+"" ) > 1 ? true : false;             // "1021341" -- > ["1", "0", "2", "3", "4", "1"]
                if(result) {
                    break;
                }
            }
            return result;
        };

        Predicate<Integer> verifyDuplicates3 = (number) -> { // 102341

            String numInString = number + ""; // "1021341"
            String uniques = "";

            for (int i = 0; i < numInString.length(); i++) {

                if (!uniques.contains(numInString.charAt(i) + "")) {
                    uniques += numInString.charAt(i); // "102
                } else {
                    return true;
                }
            }
            return false;

        };

        Predicate<Integer> verifyDuplicates1 = (number) -> {
            String numInString = number+"";
            String uniques = "";
            boolean result = false;
            for (int i = 0; i <numInString.length(); i++) {
                if (uniques.contains(numInString.charAt(i)+"")){
                    result =  true;
                }
                uniques+=numInString.charAt(i);
            }
           return result;
        };

        Predicate<Integer> verifyDuplicates2 = (number) -> {
            String numInString = number+"";
            boolean result = false;
            int count = 0;
            for (int i = 0; i <numInString.length(); i++) {
                count=0;
                for (int j = 0; j <numInString.length(); j++) {
                    if(numInString.charAt(i) == numInString.charAt(j)){
                        count++;
                    }

                }
                if (count > 1){
                   result = true;
                }

            }
            return result;
        };
        System.out.println(verifyDuplicates4.test(12345627));
        System.out.println(verifyDuplicates1.test(12345627));
        System.out.println(verifyDuplicates2.test(12345627));
        System.out.println(verifyDuplicates3.test(12345627));

    }
}
