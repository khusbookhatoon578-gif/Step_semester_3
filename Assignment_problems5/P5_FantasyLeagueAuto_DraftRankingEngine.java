package Assignment_problems5;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class P5_FantasyLeagueAuto_DraftRankingEngine {

    // Player made 'static' so it can be instantiated inside static methods like main
    static class Player implements Comparable<Player> {
        String name;
        int matchesPlayed;
        double battingAverage;
        boolean injured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        @Override
        public int compareTo(Player other) {
            // Descending order of batting average (fantasy ranking points)
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    // Overloaded Rule 1: Experience-only check
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Overloaded Rule 2: Combined matches and fitness check
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    static String draftAndRank(Player[] players) {
        List<Player> draftableList = new ArrayList<>();

        // Filter players using overloaded methods
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                draftableList.add(p);
            }
        }

        // Convert to array and sort using standard library Arrays.sort()
        Player[] draftableArray = draftableList.toArray(new Player[0]);
        Arrays.sort(draftableArray);

        // Format output string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftableArray.length; i++) {
            if (i > 0) {
                sb.append(" | ");
            }
            sb.append((i + 1)).append(". ").append(draftableArray[i].name);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
        // Expected Output: 1. Rahul | 2. Virat | 3. Dev
    }
}
