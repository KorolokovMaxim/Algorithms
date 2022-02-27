package unknown.findTDay;

import java.util.Arrays;

public class UnMain {

    public static void main(String[] args) {
        int[] solutions1 = {13,12,15,11};

        Solution1 solution1 = new Solution1();
//        int[] answers = solution1.temperaturesN1(solutions1);
//        System.out.println(Arrays.toString(answers));
        int[] answers = solution1.temperaturesN2(solutions1);
        System.out.println(Arrays.toString(answers));
    }
}
