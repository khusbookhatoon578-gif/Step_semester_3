public class VotingEligibilityChecker {
    //Method to check voting eligiblity
    public static void checkVotingEligiblity(int age){
        if(age >= 18){
            System.out.println("Eligible to vote ");

        } else {
            System.out.println("Not eligible to vote ");
        }
    }

    //Main method to test the program
    public static void main(String[] args){
        checkVotingEligiblity(21);
        checkVotingEligiblity(17);
    }
}
