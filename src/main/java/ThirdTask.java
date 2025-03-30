public class ThirdTask {
        /**
         * This method checks whether a number is a prime.
         * Time complexity: O(sqrt(n)), where n is the input number.
         * Space complexity: O(1), as it uses only a counter.
         *
         * @param n The number to check.
         * @return True if the number is prime, false otherwise.
         */
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            int number = 7;
            System.out.println(number + (isPrime(number) ? " is Prime" : " is Composite"));
        }
    }
