

import java.util.Random;

public class BmiCalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static double calculateBmi(double heightMeters, double weightKg) {
        if (heightMeters <= 0 || weightKg <= 0) {
            throw new IllegalArgumentException("Height and weight must be positive numbers.");
        }
        return weightKg / (heightMeters * heightMeters);
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-12s\n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < heights.length; i++) {
            try {
                double bmi = calculateBmi(heights[i], weights[i]);
                String status = getBmiStatus(bmi);
                System.out.printf("Person %-4d | %-12.2f | %-12.2f | %-8.2f | %-12s\n", (i + 1), heights[i], weights[i], bmi, status);
            } catch (IllegalArgumentException e) {
                System.out.printf("Person %-4d | Invalid data: %s\n", (i + 1), e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        int teamSize = 12;
        double[] heights = new double[teamSize];
        double[] weights = new double[teamSize];
        Random random = new Random();

        for (int i = 0; i < teamSize; i++) {
            heights[i] = 1.50 + (1.95 - 1.50) * random.nextDouble();
            weights[i] = 45.0 + (100.0 - 45.0) * random.nextDouble();
        }

        printWellnessReport(heights, weights);
    }

}