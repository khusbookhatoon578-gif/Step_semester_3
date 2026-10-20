package Practice_problems5;
import java.util.Arrays;

public class p1_HackathonScoreCurveBooster {
    static void curveScores(int[] scores, int bonus) {
        if (scores == null) return;
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {
        int[] scores = {88, 55, 70};
        curveScores(scores, 10);
        System.out.println(Arrays.toString(scores));
    }
}

