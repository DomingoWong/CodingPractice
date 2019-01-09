class Solution {
    public int[] plusOne(int[] digits) {
        int[] s = new int[1];
        if (checkAllNine(digits)) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    return digits;
                }
            }
            return digits;
        }
    }
    
    boolean checkAllNine(int[] array) {
        boolean allNineFlag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 9) {
                allNineFlag = false;
            }
        }
        return allNineFlag;
    }
}