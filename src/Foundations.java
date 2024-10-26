public class Foundations {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println("The total sum of this array of integers is: " + arraySum(input));
    }

    public static long arraySum(int[] arr) {
        int sum = 0;
        for(int num: arr) {
            sum += num;
        }
        return sum;
    }
}