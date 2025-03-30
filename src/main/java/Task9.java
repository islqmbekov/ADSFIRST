public class Task9 {
        /**
         * This method calculates the binomial coefficient C(n, k) using recursion.
         * Time complexity: O(2^n)
         * Space complexity: O(n)
         *
         * @param n Total items.
         * @param k Chosen items.
         * @return Binomial coefficient C(n, k).
         */
        public static int binomial(int n, int k) {
            if (k == 0 || k == n) return 1;
            return binomial(n - 1, k - 1) + binomial(n - 1, k);
        }

        public static void main(String[] args) {
            int n = 7, k = 3;
            System.out.println("C(" + n + "," + k + ") = " + binomial(n, k));
        }
    }
