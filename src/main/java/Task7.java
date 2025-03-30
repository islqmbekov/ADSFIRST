public class Task7 {
        /**
         * This method prints the array in reverse using recursion.

         * Time complexity: O(n), where n is the length of the array.
         * Space complexity: O(n), due to recursive call stack.
         *
         * @param arr The array to print in reverse.
         * @param index The current index.
         */
        public static void printReverse(int[] arr, int index) {
            if (index == arr.length) return;
            printReverse(arr, index + 1);
            System.out.print(arr[index] + " ");
        }

        public static void main(String[] args) {
            int[] numbers = {1, 4, 6, 2};
            System.out.print("Reversed array: ");
            printReverse(numbers, 0);
        }
    }

