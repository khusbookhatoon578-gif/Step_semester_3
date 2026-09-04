

public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null || original.length() != typed.length()) {
            System.out.println("Error: Inputs must be non-null and of equal length.");
            return;
        }

        int totalChars = original.length();
        int matchedCount = 0;
        int firstMismatchPos = -1;

        for (int i = 0; i < totalChars; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedCount++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based index position
            }
        }

        double accuracy = ((double) matchedCount / totalChars) * 100;

        if (firstMismatchPos != -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')\n",
                    matchedCount, totalChars, accuracy, firstMismatchPos,
                    original.charAt(firstMismatchPos - 1), typed.charAt(firstMismatchPos - 1));
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches\n", matchedCount, totalChars, accuracy);
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("Practising java", "practising Java");
        checkTypingAccuracy("Typing", "typingn");
    }
}