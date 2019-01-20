package Chap1;

public class OneAway {

    public static void main(String[] args) {
        System.out.println(oneAway("pale", "paede"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));

    }
    
    /**
     * Insert, remove or replace a character. To check one edit (or zero edit) away.
     */
    public static boolean oneAway(String str1, String str2) {
        int edit = 0;
        int minLength = str1.length() < str2.length()? str1.length() : str2.length();
        int i1 = 0; int i2 = 0;
        if (str1.length() - str2.length() >= 2 || str2.length() - str1.length() >= 2) {
            return false;
        } else {
            for (i1 = 0; i1 < minLength; i1++) {
                System.out.println("i1, i2: " + i1 + "; " + i2);
                if (str1.charAt(i1) == str2.charAt(i2)) {
                    i2++;
                    System.out.println("Same " + i1 + str1.charAt(i1) + ", " + (i2-1) + str2.charAt(i2-1) + " Edit: " + edit);
                } else if (i1 + 1 >= str1.length() || i2 + 1 >= str2.length()) {
                    System.out.println("flag");
                    if (str1.length() - i1 > 2 || str2.length() - i2 > 2) {
                        return false;
                    } else if (str1.length() == i1 - 1 && str2.length() == i2 - 1){
                        break;
                    } else {
                        edit++;
                        break;
                    }
                } else {
                    if (str1.charAt(i1 + 1) == str2.charAt(i2 + 1)) { //replace
                        i2++;
                        edit++;
                        System.out.println("Replace " + i1 + str1.charAt(i1) + ", " + i2 + str2.charAt(i2) + " Edit: " + edit);
                    }
                    else if (str1.charAt(i1 + 1) == str2.charAt(i2)) { //remove
                        edit++;
                        System.out.println("Remove " + i1 + str1.charAt(i1) + ", " + i2 + str2.charAt(i2) + " Edit: " + edit);
                    }
                    else if (str1.charAt(i1) == str2.charAt(i2 + 1)) { //insert
                        i2 += 2;
                        edit++;
                        System.out.println("Insert " + i1 + str1.charAt(i1) + ", " + i2 + str2.charAt(i2) + " Edit: " + edit);
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        System.out.println("Edit: " + edit);
        return edit < 2;
    }

}
