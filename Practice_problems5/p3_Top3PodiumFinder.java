package Practice_problems5;
import java.util.Arrays;

public class p3_Top3PodiumFinder {
    static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        if (scores != null) {
            for (int score : scores) {
                if (score > first) {
                    third = second;
                    second = first;
                    first = score;
                } else if (score == first) {
                    third = second;
                    second = score;
                } else if (score > second) {
                    third = second;
                    second = score;
                } else if (score == second) {
                    third = score;
                } else if (score > third) {
                    third = score;
                }
            }
        }
        return new int[] { first, second, third };
    }

    public static void main(String[] args) {
        int[] scores = {45, 82, 79, 90, 33, 90, 61};
        System.out.println(Arrays.toString(findTopThreeScores(scores))); // Output: [90, 90, 82]
    }
}

