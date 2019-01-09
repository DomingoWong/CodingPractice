class Solution{
    public boolean isPalindrome(String s) {
        for(int start = 0, end = s.length() - 1; start < end; start++, end--) {
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))) 
                start++;
            
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))) 
                end--;
            
            if(start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
        }
        return true;
    }
}