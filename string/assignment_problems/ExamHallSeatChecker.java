

public class ExamHallSeatChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No seat numbers provided.");
            return;
        }

        boolean duplicateFound = false;

        // Loop through array to find duplicates using basic loops only
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] input1 = {101, 102, 103, 102, 105};
        System.out.print("Test 1 Result: ");
        checkDuplicateSeats(input1);

        int[] input2 = {101, 102, 103, 104, 105};
        System.out.print("Test 2 Result: ");
        checkDuplicateSeats(input2);
    }
}