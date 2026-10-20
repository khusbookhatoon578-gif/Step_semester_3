package Assignment_problems5;

import java.sql.SQLOutput;

public class P2_DuplicatePlayerPickChecker {

    static String findDuplicatePick(String[] playerNames){
        for(int i = 0; i < playerNames.length; i++) {
            for(int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])){
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        String[] lineup1 = {"Salah", "Mehdi Taremi", "Ronaldo", "Yamal", "Salah"};
        System.out.println(findDuplicatePick(lineup1));

        String[] lineup2 = {"Mehdi Taremi", "Ramin", "Salah"};
        System.out.println(findDuplicatePick(lineup2));
    }
}
