package unknown.findSumTwoValues;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    //[-3,0,2,4,5]

    /**
     * Задача
     * Найти в массиве два числа
     * сумма которых будет ровняться
     * выбранному числу
     *
     * @param numbers - массив чисел
     * @param k       - искомая сумма двух чисел в массиве
     * @return - возвращаем два числа, которые в сумме дадут искомую сумму
     */

    public int[] twoSum(int[] numbers, int k) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == k) {
                    return new int[]{numbers[i], numbers[j]};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSumHasSet(int[] numbers, int k) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            int numberToFind = k - number;
            if (set.contains(numberToFind)) {
                return new int[]{numberToFind, number};
            }
            set.add(number);
        }
        return new int[0];
    }

    public int[] twoSumWithBSearch(int[] numbers, int k) {
        for (int i = 0; i < numbers.length; i++) {
            int numberToFInd = k - numbers[i];
            int lowerBound = i + 1;
            int upperBound = numbers.length - 1;
            while (lowerBound <= upperBound) {
                int middle = lowerBound + (upperBound - lowerBound) / 2;
                if (numbers[middle] == numberToFInd) {
                    return new int[]{numbers[i], numbers[middle]};
                }
                if (numberToFInd < numbers[middle]) {
                    upperBound = middle - 1;
                } else {
                    lowerBound = middle + 1;
                }
            }
        }
        return new int[0];
    }

    public int[] twoSumWithTwoIndex(int[] numbers, int k) {

        int firstElem = 0;
        int lastElem = numbers.length - 1;
        while (firstElem < lastElem) {
            int sum = numbers[firstElem] + numbers[lastElem];
            if (sum == k) {
                return new int[]{numbers[firstElem], numbers[lastElem]};
            }
            if (sum < k) {
                firstElem++;
            } else {
                lastElem--;
            }
        }
        return new int[0];
    }

}
