class Solution {
    public int reverse(int x) {
        int pop = x % 10;
        x /= 10;
        long result = 0;
        while (x != 0) {
            result = (result + pop) * 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            pop = x % 10;
            x /= 10;
        }
        result += pop;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)result;
    }
}