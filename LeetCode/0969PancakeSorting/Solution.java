/*Pancake Sorting
Given an array A, we can perform a pancake flip: We choose some positive integer k <= A.length, then reverse the order of the first k elements of A.  We want to perform zero or more pancake flips (doing them one after another in succession) to sort the array A.

Return the k-values corresponding to a sequence of pancake flips that sort A.  Any valid answer that sorts the array within 10 * A.length flips will be judged as correct.
*/
/*
Example 1:
Input: [3,2,4,1]
Output: [4,2,4,3]
Explanation: 
We perform 4 pancake flips, with k values 4, 2, 4, and 3.
Starting state: A = [3, 2, 4, 1]
After 1st flip (k=4): A = [1, 4, 2, 3]
After 2nd flip (k=2): A = [4, 1, 2, 3]
After 3rd flip (k=4): A = [3, 2, 1, 4]
After 4th flip (k=3): A = [1, 2, 3, 4], which is sorted. 
*/

/*
Input: [1,2,3]
Output: []
Explanation: The input is already sorted, so there is no need to flip anything.
Note that other answers, such as [3, 3], would also be accepted.
*/
/*
Note:
1. 1 <= A.length <= 100
2. A[i] is a permutation of [1, 2, ..., A.length]
*/

class Solution {
    public List<Integer> pancakeSort(int[] A) {
        /**
         * findmax;
         * flip(maxindex);
         * flip(maxposition);
         */
        boolean sortedFlag = true;
        ArrayList<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            aList.add(A[i]);
            if(A[i] != i+1) {
                sortedFlag = false;
            }
        }
        if(sortedFlag){
            return new ArrayList<Integer>();
        }
        
        List<Integer> kList = new ArrayList<Integer>();
        int unsortedMax = A.length;
        while(unsortedMax > 1) {
            int unsortedMaxIndex = aList.indexOf(unsortedMax);
            flip(aList, unsortedMaxIndex + 1); kList.add(unsortedMaxIndex + 1);
            flip(aList, unsortedMax); kList.add(unsortedMax);
            unsortedMax--;
        }
        return kList;
        
    }
    public void flip(ArrayList<Integer> arrayList, int k) {
        int start = 0;
        k = k - 1;
        while (start < k) {
            int temp = arrayList.get(start);
            arrayList.set(start, arrayList.get(k));
            arrayList.set(k, temp);
            start++;
            k--;
        }
    }
}