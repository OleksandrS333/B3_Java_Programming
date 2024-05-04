package day21_arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int eve = 0;
        int odd = 0;
        String even = "";
        String oddd = "";
        int [] nums = {4, 1, 12, 5, 20 , 157};
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] %2==0){
                eve++;
                even = even + " " + nums[i];
            } else {
                odd++;
                oddd = oddd + " " + nums[i];
            }
        }
        System.out.println("even: " + eve + "\nodd: " +odd);
        System.out.println("Even: " +even + "\nOdd: " + oddd);
    }
}

/*
int [] nums = {4, 1, 3, 12, 5, 20, 13};
int evenCount = 0;
int oddCount = 0;
String evenNums = "".trim();
String oddNums = "";


        for (int eachNum : nums) {

        if (eachNum % 2 == 0) {
evenCount++;
evenNums += eachNum + " ";
        } else {
oddCount++;
oddNums += eachNum + " ";
        }
        }
        System.out.println(evenNums); // 4 12 20_

evenNums = evenNums.trim();
oddNums = oddNums.trim();

        System.out.println("Even: " + evenCount);
        System.out.println("Even nums: " + evenNums.trim());
        System.out.println("Odd: " + oddCount);
        System.out.println("Odd nums: " + oddNums.trim());
        */