package Practice_problems5;

public class p4_HackathonSeatingGridOptimizer {
    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) return 0.0;
        double sum = 0;
        for (int val : row) {
            sum += val;
        }
        return sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {
        if (seatingScores == null || seatingScores.length == 0) return "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);
            String status = (avg >= threshold) ? "Buzzing Zone" : "Quiet Zone";

            sb.append("Row ").append(i).append(": ").append(status);
            if (i < seatingScores.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] seatingScores = {
                {40, 50, 45},
                {85, 90, 95},
                {30, 20, 25}
        };
        System.out.println("\"" + classifyRows(seatingScores, 60) + "\"");

    }
}

