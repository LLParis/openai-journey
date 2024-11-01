/**
 * Class for the purpose of exploring sequential search and practicing implementation.
 *
 * @author London Paris
 */

import java.util.*;

public class SequentialSearch {

    public static void main(String[] args) {
        int target = 7;
        int[] numbers = {7, 12, 5, 7, 20, 7, 15};

        System.out.println("First occurrence of " + target + " is at index: " + findFirstOccurrence(numbers, target));
        System.out.println("The indices containing our target number, " + target +", are: " + findAllOccurrences(numbers, target));
        System.out.println("Last occurrence of " + target + " is at index: " + findLastOccurrence(numbers, target));
    }

    /**
     * Searches for the first occurrence of the target number in the array.
     * @param arr Array of integers to search
     * @param target Target price to search for in the array.
     * @return Index of the first occurrence of targetPrice if found; otherwise, -1 if not found.
     * @throws IllegalArgumentException if arr is null or empty.
     */
    public static int findFirstOccurrence(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain values.");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return immediately on finding first occurrence of the target price
                }
            }
        return -1; // Target price not found in the array
    }

    /**
     * Searches for all occurrences of the target number within the array.
     * @param arr Array of integers to search for target
     * @param target Target number to search for in the array
     * @return List of indices where target appears in the array, or an empty list if none are found.
     * @throws IllegalArgumentException if arr is null or empty.
     */
    public static List<Integer> findAllOccurrences(int[] arr, int target) {
        // Error handling
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain values.");
        }
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i); // Add index to array
            }
        }
        return indices;
    }

    /**
     * Searches for the last occurrence of the target number in the array.
     * @param arr Array of integers to search.
     * @param target Target price to search for in the array.
     * @return Index of the last occurrence of the target price in the array. Returns nothing if not found.
     */
    public static int findLastOccurrence(int[] arr, int target) {
        // Error handling
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain values.");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}