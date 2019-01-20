class Solution {
    public int climbStairs(int n) {

        if (n < 3) {
            return n;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
    //Time complexity: O(2^n) 
    //Space complexity: O(1)

    //maintain a table that contains the fibonacci number of this index;
    //Time complexity: O(n)
    //Space complexity: O(n)
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i<n+1;i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}