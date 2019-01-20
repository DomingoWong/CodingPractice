package Chap1;

public class URLify {

    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        System.out.println('\0');
        System.out.println(urlify(input, 13));

    }

    /**
     * REPLACE ALL SPACES WITH '%20'
     * Example: 
     * Input:  "Mr John  ", 7
     * Output: "Mr20%John"
     */
    public static String urlify(String str, int length) {
        int index = 0;
        String output = "";
        for (index = 0; index < length; index++) {
            if(str.charAt(index) == ' ') {
                output = output + "20%";
            }
            else{
                output = output + str.charAt(index);
            }
        }
        return output;
    }
}
