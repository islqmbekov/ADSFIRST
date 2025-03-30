public class FourthTask{
        /**
         * This method calculates the factorial of a number using recursion.
         * Time complexity: O(n), where n is the input number.
         * Space complexity: O(n), due to the recursive call stack.
         *
         * @param n The number whose factorial is to be calculated.
         * @return The factorial of the number.
         */
        public static int factorial(int n) {
            if (n <= 1) return 1;
            return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            int number = 5;
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        }
    }