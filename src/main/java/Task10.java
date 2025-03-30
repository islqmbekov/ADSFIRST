public class Task10 {
        /**
         * This method finds the GCD of two numbers using recursion (Euclidean algorithm).
         * Time complexity: O(log(min(a, b)))
         * Space complexity: O(log(min(a, b)))
         *
         * @param a First number.
         * @param b Second number.
         * @return GCD of a and b.
         */
        public static int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }

        public static void main(String[] args) {
            int a = 32, b = 48;
            System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
        }
    }
