package Assignment_problems5;

public class P4_MatchDayGrindAnalyzer {

        //Private helper method to compute row average safely
        private static double rowAverage(int[] row) {
            if (row == null || row.length == 0) return 0.0;
            double sum = 0;
            for (int runs : row) {
                sum += runs;
            }
            return sum / row.length;
        }

        static String classifyMatches(int[][] runsPerOver, int threshold) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < runsPerOver.length; i++) {
                double avg = rowAverage(runsPerOver[i]);
                String status = (avg >= threshold) ? "Power Surge" : "Normal";

                if (i > 0) {
                    result.append(" | ");
                }
                result.append("Match ").append(i).append(": ").append(status);
            }

            return result.toString();
        }

        public static void main(String[] args) {
            int[][] runsPerOver = {
                    {4, 6, 8},
                    {10, 12, 14},
                    {2, 3, 1}
            };
            int threshold = 8;

            System.out.println(classifyMatches(runsPerOver, threshold));

        }
    }

