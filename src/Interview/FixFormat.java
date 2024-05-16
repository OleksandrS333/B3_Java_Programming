package Interview;

import my_utilities.StringUtil;

public class FixFormat {
    public static void main(String[] args) {
        String str = "AlEx";
       str =  fixFormat(str);
        System.out.println(str);
        StringUtil.reverse("asd");
        System.out.println(StringUtil.reverse("asd"));
    }



    public static String fixFormat (String word) {
        String result = "";
        result = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return result;
    }






}
