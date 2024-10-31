import java.util.*;

public class SequentialSearch {

    public static void main(String[] args) {
        int targetPrice = 25;
        int[] prices = {34, 12, 25, 67, 25, 100, 25};

        System.out.println("Indices of the target price: " + sequentialSearch(prices, targetPrice));
        System.out.println("All occurrences of price " + targetPrice + " are at indices: " + modSequentialSearch(prices, targetPrice));

    }

    /**
     * Searches for the first occurrence of the target price in the array.
     * @param arr Array of integers to search
     * @param targetPrice Target price to search for in the array.
     * @return Index of the first occurrence of targetPrice if found; otherwise, -1.
     * @throws IllegalArgumentException if arr is null or empty.
     */
    public static int sequentialSearch(int[] arr, int targetPrice) {
        if (arr == null || arr.length <= 0) {
            throw new IllegalArgumentException("Array must contain values.");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetPrice) {
                return i; // Return immediately on finding first occurrence of the target price
                }
            }
        return -1; // Target price not found in the array
    }

    public static List<Integer> modSequentialSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Value must be greater than zero.");
        }
        List<Integer> stock = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                stock.add(i);
            }
        }
        return stock;
    }
}