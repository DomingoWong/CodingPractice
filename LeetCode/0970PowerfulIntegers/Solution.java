/**
 * Input: x = 2, y = 3, bound = 10
 * Output: [2,3,4,5,7,9,10]
 * Explanation: 
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 * =====================
 * Input: x = 3, y = 5, bound = 15
 * Output: [2,4,6,8,10,14]
 *
 */
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int i = 0;
        int j = 0;
        int temp = 0;
        if(x != 1) {
            while(Math.pow(x,i) <= bound-1) {
                i++;
            }
        }
        if(y != 1) {
            while(Math.pow(y,j) <= bound-1) {
                j++;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int p = 0; p <= i; p++) {
            for (int q = 0; q <= j; q++) {
                temp = (int)((int)Math.pow(x,p)+(int)Math.pow(y,q));
                if (temp <= bound && result.indexOf(temp) == -1) {
                    result.add(temp);
                } else if (temp > bound) {
                    break;
                }
            }
        }
        return result;
    }
}