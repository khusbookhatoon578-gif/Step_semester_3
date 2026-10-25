package practice5_problems;
import java.util.Arrays;
public class P1_HackathonScoreCurveBooster {




        // Problem 1: Hackathon Score Curve Booster
        // Modifies the caller's original array directly in place by adding bonus
        public static void curveScores(int[] scores, int bonus) {
            if (scores == null) {
                return;
            }
            for (int i = 0; i < scores.length; i++) {
                scores[i] += bonus;
            }
        }

        public static void main(String[] args) {
            int[] scores = {74, 55, 80};
            System.out.println("Original scores: " + Arrays.toString(scores));
            curveScores(scores, 10);
            System.out.println("Curved scores: " + Arrays.toString(scores));
        }
    }


