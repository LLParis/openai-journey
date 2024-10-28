import java.util.*;

public class Foundations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("The total sum of this array of integers is: " + arraySum(arr));
    }

    public static long arraySum(int[] arr) {
        int sum = 0;
        for(int num: arr) {
            sum += num;
        }
        return sum;
    }

    public static int[] arrayTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                int[] solution = {arr[i], arr[i + 1]};
                return solution;
            }
        }
        return new int[0];
    }

    public int sumOfTwoIntegers(int a, int b) {
       return a + b;
    }
}