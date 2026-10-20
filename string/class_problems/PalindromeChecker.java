
import java.util.Scanner;
public class PalindromeChecker {


        public static boolean isPalindromeIterative(String text) {
            if (text == null) return false;
            String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left = 0;
            int right = cleaned.length() - 1;

            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }

        public static boolean isPalindromeRecursive(String text) {
            if (text == null) return false;
            String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            return checkRecursive(cleaned, 0, cleaned.length() - 1);
        }

        private static boolean checkRecursive(String str, int left, int right) {
            if (left >= right) return true;
            if (str.charAt(left) != str.charAt(right)) return false;
            return checkRecursive(str, left + 1, right - 1);
        }

        public static boolean isPalindromeArrayReversal(String text) {
            if (text == null) return false;
            String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            char[] chars = cleaned.toCharArray();
            char[] reversed = new char[chars.length];

            for (int i = 0; i < chars.length; i++) {
                reversed[i] = chars[chars.length - 1 - i];
            }
            return new String(chars).equals(new String(reversed));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text to check for palindrome: ");
            String input = scanner.nextLine();

            try {
                if (input.trim().isEmpty()) {
                    throw new Exception("Input text cannot be blank.");
                }
                boolean iterativeRes = isPalindromeIterative(input);
                boolean recursiveRes = isPalindromeRecursive(input);
                boolean arrayRes = isPalindromeArrayReversal(input);

                System.out.println("Iterative: " + (iterativeRes ? "Palindrome" : "Not Palindrome"));
                System.out.println("Recursive: " + (recursiveRes ? "Palindrome" : "Not Palindrome"));
                System.out.println("Array Reversal: " + (arrayRes ? "Palindrome" : "Not Palindrome"));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }


