package src.main.service;

public class MaximumSubArrayService {

    public int findMaximumSubArray(int[] inputToCheck) {
        int maximumSubarrayCount = -1;
        // Pre-check
        if (inputToCheck == null || inputToCheck.length < 1) {
            return maximumSubarrayCount;
        }

        // Initializing variables.
        int maximumSoFar = inputToCheck[0];
        int maximumEndingHere = inputToCheck[0];

        // Iterate through the array
        for (int i = 0; i < inputToCheck.length; i++) {
            // Update maximumEndingHere to include the current element
            maximumEndingHere = Math.max(inputToCheck[i], maximumEndingHere + inputToCheck[i]);
            // Update maximumSoFar if maximumEndingHere is greater.
            maximumSoFar = Math.max(maximumSoFar, maximumEndingHere);
        }
        maximumSubarrayCount = maximumSoFar;
        return maximumSubarrayCount;
    }

}
