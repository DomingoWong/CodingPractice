class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        boolean isLastWord = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (isLastWord) {
                    return result;
                }
            } else {
                isLastWord = true;
                result++;
            }
        }
        return result;
    }
}