package Chap1;

public class CheckPermutation {

	public static void main(String[] args) {
		System.out.println(checkPermutation("123","231"));
		System.out.println(checkPermutation("123","21"));
		System.out.println(checkPermutation("123","212"));


	}

	/**
	 * DECIDE IF ONE STRING IS A PERMUTATION OF THE OTHER
	 */
	public static boolean checkPermutation(String str1, String str2) {
//
//		boolean[] str1Flag = new boolean[str1.length()];
//
//		boolean result = true;
//
//		for(int index = 0; index<str2.length(); index++) {
//			for(int str1Index = 0; str1Index<str1.length(); str1Index++){
//				str1Flag[str1Index] = false;
//				if(str1Flag[str1Index] == false && str2.charAt(index) == str1.charAt(str1Index)) {
//					str1Flag[str1Index] = true;
//				}
//				else{}
//			} 
//		}
//		for(int i = 0; i<str1Flag.length; i++){
//			result &= str1Flag[i];
//		}
//		return result;
		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			int[] letters = new int[128];
			for(int i = 0;i<str1.length();i++) {
				letters[str1.charAt(i)]++;
			}
			for(int i=0;i<str2.length();i++) {
				letters[str2.charAt(i)]--;
				if(letters[str2.charAt(i)]<0) {
					return false;
				}
			}
			return true;
		}
	}
	
	
}
