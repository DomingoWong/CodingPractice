package Chap1;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));

        System.out.println(stringCompression("abcdccfccaaa"));

    }
    
    /**
     * Input: aabcccccaaa, Output: a2b1c4a3
     */
    static String stringCompression (String input) {
        String output = "";
        int i = 0;
        int count = 1;
        for (i = 0; i < input.length(); i++) {
            if (i + 1 >= input.length()) {
                output = output + input.charAt(i) + count;
            } else {
                if (input.charAt(i + 1) == input.charAt(i)) {
                    count++;
                } else {
                    output = output + input.charAt(i) + count;
                    count = 1;
                }
            }
        }
        if (output.length() > input.length()) {
            return input;
        } else {
            return output;
        }
    }
}
