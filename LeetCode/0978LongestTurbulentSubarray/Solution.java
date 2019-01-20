class Solution {
    public int maxTurbulenceSize(int[] A) {
        if(A.length == 1){
            return 1;
        }
        int[] isValid = new int[A.length - 1];
        for (int i = 0; i<A.length-1; i++) {
            if (A[i] < A[i+1]) {
                isValid[i] = 1;
            } else if (A[i] > A[i+1]) {
                isValid[i] = 0;
            } else {
                isValid[i] = 3;
            }
        }
        //find maximun sequence 1 or sequence 0
        int result = 1;
        int count = 1;
        for (int i = 1; i<isValid.length; i++) {
            // System.out.println(isValid[i]);
            if(isValid[i] == isValid[i-1]+1 || isValid[i] == isValid[i-1]-1) {
                count++;
                // System.out.println("count = " + count);
                // System.out.println("result = "+ result);
                if(count > result) {
                    result = count;
                    // System.out.println("if result = "+ result);
                }
            } else {
                count = 1;
                // System.out.println("count = " + count);s
            }
        }
        result += 1;
        return result;
    }
}