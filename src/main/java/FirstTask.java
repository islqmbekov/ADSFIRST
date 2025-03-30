public class FirstTask {
    /**
     * This method finds the minimum number in the given array.
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm iterates through the array once, comparing each element to find the minimum.
     * Space complexity: O(1), as we use a single variable to store the minimum.
     *
     * @param arr The array of numbers.
     * @return The minimum value in the array.
     */
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Example usage of the findMin method
        int[] numbers = {10, 1, 32, 3, 45};
        int min = findMin(numbers);
        System.out.println("The minimum value is: " + min);
    }
}