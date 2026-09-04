

public class CsvStudentRecordParser {
    public static void parseStudentRecord(String csvLine) {
        if (csvLine == null) {
            System.out.println("Invalid Record");
            return;
        }
        String[] parts = csvLine.split(",");
        if (parts.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        String name = parts[0].trim();
        String rollNo = parts[1].trim();
        String dept = parts[2].trim();

        System.out.printf("Name: %s | Roll No: %s | Dept: %s\n", name, rollNo, dept);
    }

    public static void main(String[] args) {
        parseStudentRecord("Anne Jane, RA2211003010123,Chemical Engineering");
        parseStudentRecord("Anne Jane,Chemical Engineering");
    }
}