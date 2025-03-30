public class Task8 {
        /**
         * This method checks whether the given string consists only of digits.
         * Time complexity: O(n), where n is the length of the string.
         * Space complexity: O(1), no extra space used.
         *
         * @param s The string to check.
         * @return True if the string contains only digits, false otherwise.
         */
        public static boolean isAllDigits(String s) {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            String input = "123456";
            System.out.println("Is all digits: " + isAllDigits(input));
        }
    }

