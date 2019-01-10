class Solution {
    public int myAtoi(String str) {
		// handle edge cases
        if (str == null || str.isEmpty())
            return 0;
        
        int factor = 1;
        int res = 0;
        int idx = 0;
        
        // handle all the leading spaces.
        while (str.charAt(idx) == ' ') {
            idx++;
            if (idx >= str.length()) return 0;
        }
        
        // handle the sign of the number.
        if (str.charAt(idx) == '-') {
            factor = -1;
            idx++;
        } else if (str.charAt(idx) == '+') {
            idx++;
        }
        
        // handle the overflow and invalid input
        while (idx < str.length() && str.charAt(idx) >= '0' && str.charAt(idx) <= '9') {
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(idx) - '0' > 7)) {
                if (factor == 1)
                    return Integer.MAX_VALUE;
                else 
                    return Integer.MIN_VALUE;
            }
            res = res * 10 + (str.charAt(idx) - '0');
            idx++;
        }
        
        return res * factor;
    }
}