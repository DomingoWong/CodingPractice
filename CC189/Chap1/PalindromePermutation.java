package Chap1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;


public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(palindromePermutation("Acto cota"));
    }
    /** 
     * To check if input is a permutation(排列) of a palindrome(回文)
     */
    public static boolean palindromePermutation(String input) {
        input = input.toLowerCase();
        Hashtable<Character, Integer> hashTable = buildHashtable(input);
        int oddNumber = checkOddHashtable(hashTable);
        if (oddNumber < 2) 
            return true;
        else 
            return false;
    }

    private static Hashtable<Character, Integer> buildHashtable(String input) {
        Hashtable<Character, Integer> result = new Hashtable<Character, Integer>();
        char currentChar = ' ';
        for(int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            if(currentChar != ' ') {
                if(result.containsKey(currentChar)) {
                    result.put(currentChar, result.get(currentChar) + 1);
                }
                else {
                    result.put(currentChar, 1);
                }
                System.out.println("Key: " + currentChar + "; Value: " + result.get(currentChar));
            }
        }
        return result;
    };

    private static int checkOddHashtable(Hashtable<Character, Integer> h) {
        int oddCount = 0;
        Iterator<?> i = h.entrySet().iterator();
        while(i.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>)i.next();
            if(entry.getValue() % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

}
