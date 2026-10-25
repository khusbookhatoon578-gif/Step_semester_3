package practice7_problems;

public class P5_AttendanceSheet {

        // Private array holding names of present students (no getter returning the array)
        private final String[] presentStudents;
        private int presentCount;

        public P5_AttendanceSheet(int maxClassSize) {
            this.presentStudents = new String[maxClassSize];
            this.presentCount = 0;
        }

        // Marks a student present, preventing duplicate entries
        public void markPresent(String name) {
            if (name == null || name.trim().isEmpty()) {
                return;
            }
            if (!isPresent(name) && presentCount < presentStudents.length) {
                presentStudents[presentCount++] = name;
            }
        }

        // Exposes only count
        public int getPresentCount() {
            return presentCount;
        }

        // Exposes yes/no lookup
        public boolean isPresent(String name) {
            if (name == null) {
                return false;
            }
            for (int i = 0; i < presentCount; i++) {
                if (presentStudents[i].equals(name)) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            P5_AttendanceSheet sheet = new P5_AttendanceSheet(30);
            sheet.markPresent("Haadiya");
            sheet.markPresent("Brian");
            sheet.markPresent("Ahmad");
            System.out.println("sheet.getPresentCount() -> " + sheet.getPresentCount()); // 2
            System.out.println("sheet.isPresent(\"Brian\") -> " + sheet.isPresent("Brian"));   // true
            System.out.println("sheet.isPresent(\"Ahmad\") -> " + sheet.isPresent("Ahmad")); // false
        }
    }


