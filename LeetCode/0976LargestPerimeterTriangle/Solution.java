class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int length = A.length;
        for (int i = length - 1 ; i >= 2; i--) {
            if ((A[i-2] + A[i-1]) <= A[i]) {
            } else {
                return (A[i] + A[i-1] + A[i-2]);
            }
        }
        return 0;
    }
}