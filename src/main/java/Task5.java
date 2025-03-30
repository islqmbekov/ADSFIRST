public class Task5 {
        /**
         * This method returns the n-th Fibonacci number using recursion.

         * Time complexity: O(2^n), due to repeated calculations.
         * Space complexity: O(n), due to the call stack.
         *
         * @param n The position in the Fibonacci sequence.
         * @return The n-th Fibonacci number.
         */
        public static int fibonacci(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static void main(String[] args) {
            int number = 5;
            System.out.println("Fibonacci(" + number + ") = " + fibonacci(number));
        }
    }
