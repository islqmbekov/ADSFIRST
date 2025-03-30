public class Task6 {
    /**
     * This method calculates a raised to the power of n using recursion.
     * Time complexity: O(n), where n is the exponent.
     * Space complexity: O(n), due to recursive calls.
     *
     * @param a The base.
     * @param n The exponent.
     *@return a raised to the power n.
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        int a = 2, n = 10;
        System.out.println(a + "^" + n + " = " + power(a, n));
    }
}