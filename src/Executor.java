import java.util.Arrays;

import src.main.service.MaximumSubArrayService;

public class Executor {
    public static void main(String[] args) throws Exception {
        /*
         * Write a method to find the maximum sum of a contiguous subarray in an integer
         * array.
         * 
         * Please note that it is also known as Kadane's Algorithm.
         * 
         * int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
         * Output: 6
         * 
         */
        generateGapInConsole();
        System.out.println(
                "find the maximum sum of a contiguous subarray in an integer array. This is also known as Kadane's Algorithm");

        MaximumSubArrayService maximumSubArrayService = new MaximumSubArrayService();
        int[] inputToCheck = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maximumSubArrayService.findMaximumSubArray(null);
        displayResult(inputToCheck, result);
        generateGapInConsole();
    }

    private static void displayResult(int[] inputToCheck, int result) {
        if (result == 0) {
            System.out.println("The maximum sum of a contiguous subarray in  the input:" + Arrays.toString(inputToCheck)
                    + " cannot be processed correctly.");

        } else {
            System.out
                    .println("The maximum sum of a contiguous subarray in  the input:" + Arrays.toString(inputToCheck)
                            + " is '" + result
                            + "'.");
        }
    }

    private static void generateGapInConsole() {
        System.out.println();
        System.out.println();
    }
}
