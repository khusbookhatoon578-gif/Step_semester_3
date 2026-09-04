import java.util.Scanner;

public class FirstNonRepeatingChar {


        public static char findFirstNonRepeatingChar(String text) throws RuntimeException {
            if (text == null || text.isEmpty()) {
                throw new IllegalArgumentException("Input text cannot be empty or null.");
            }

            int[] charFrequencies = new int[254];

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch < 254) {
                    charFrequencies[ch]++;
                }
            }

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch < 254 && charFrequencies[ch] == 1) {
                    return ch;
                }
            }

            throw new RuntimeException("No Non-Repeating Character Found");
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter string: ");
            String input = scanner.nextLine();

            try {
                char result = findFirstNonRepeatingChar(input);
                System.out.println("First Non-Repeating Character: '" + result + "'");
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

