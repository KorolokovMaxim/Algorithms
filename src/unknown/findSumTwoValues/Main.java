package unknown.findSumTwoValues;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {-3,0,1,3,4};
        int found = 5;


        System.out.println(Arrays.toString(solution.twoSumWithTwoIndex(num, found)));
    }
}
