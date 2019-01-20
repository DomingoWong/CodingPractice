package Chap1;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isUnique("44"));
		System.out.println(isUnique("117"));
		System.out.println(isUnique("132"));
	}
	
	/**
	 * DETERMINE IF A STRING HAS ALL UNIQUE CHARACTERS.
	 */
	public static boolean isUnique(String str) {
	    boolean isUnique = true;
	    for (int index = 0; index < str.length(); index++) {
	        if (str.indexOf(str.charAt(index))!= index ){
	            isUnique = false;
	        }
	    }
	    return isUnique;
	}

}
