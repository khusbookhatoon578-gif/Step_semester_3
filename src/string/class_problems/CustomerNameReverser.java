package string.class_problems;

public class CustomerNameReverser {
    public static String reverseCustomerName(String customerName){
        if (customerName == null) {
            return null;
        }
        char[] originalChars = customerName.toCharArray();
        char[] reversedChars = new char[originalChars.length];

        for(int i=0; i<originalChars.length; i++){
            reversedChars[i] = originalChars[originalChars.length - 1 -i];
        }
        return new String(reversedChars);
    }
    public static void main(String[] args) {
        String name = "Mani";

                try {
                    String reversedName = reverseCustomerName(name);
                    System.out.println("Original Name: " + name);
                    System.out.println("Reversed Name: " + reversedName);
                } catch (Exception e) {
                    System.out.println("Error processing customer name: " + e.getMessage());
                }
    }

}
