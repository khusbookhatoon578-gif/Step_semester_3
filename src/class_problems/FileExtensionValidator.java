

public class FileExtensionValidator {
    public static String validateFileExtension(String filename) {
        if (filename == null || !filename.contains(".")) {
            return "Rejected - invalid file type";
        }
        int dotIndex = filename.lastIndexOf('.');
        String ext = filename.substring(dotIndex + 1).toLowerCase();

        if (ext.equals("pdf") || ext.equals("docx") || ext.equals("zip")) {
            return "Accepted";
        } else {
            return "Rejected - invalid file type";
        }
    }

    public static void main(String[] args) {
        System.out.println(validateFileExtension("Assignment1.PDF"));
        System.out.println(validateFileExtension("notes.pdf"));
    }
}