package Practice_problems5;

public class p2_DuplicateTeamNameFinder {
    static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null || teamNames.length < 2) {
            return "No Duplicates Found";
        }
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        String[] team1 = {"ByteForce", "RockCode", "ByteForce"};
        String[] team2 = {"ByteForce", "CodeCrafters", "NullPointers"};

        System.out.println("\"" + findDuplicateTeam(team1) + "\""); // Output: "Duplicate Found: ByteForce"
        System.out.println("\"" + findDuplicateTeam(team2) + "\""); // Output: "No Duplicates Found"
    }
}

