

import java.util.Random;
import java.util.Scanner;

    public class RockPaperScissors {

        private static final String[] MOVES = {"Rock", "Paper", "Scissors"};

        public static String getComputerMove() {
            Random random = new Random();
            return MOVES[random.nextInt(MOVES.length)];
        }

        public static String playRound(String playerMove, String computerMove) throws IllegalArgumentException {
            if (!isValidMove(playerMove)) {
                throw new IllegalArgumentException("Invalid move provided: " + playerMove);
            }

            if (playerMove.equalsIgnoreCase(computerMove)) {
                return "Draw";
            }

            if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                    (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                    (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
                return "Player Wins";
            } else {
                return "Computer Wins";
            }
        }

        private static boolean isValidMove(String move) {
            for (String validMove : MOVES) {
                if (validMove.equalsIgnoreCase(move)) return true;
            }
            return false;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalRounds = 5;
            int wins = 0, losses = 0, draws = 0;

            System.out.println("--- Rock-Paper-Scissors Match ---");

            for (int i = 0; i < totalRounds; i++) {
                System.out.print("Round " + (i + 1) + " - Enter move (Rock, Paper, Scissors): ");
                String playerMove = scanner.nextLine().trim();
                String computerMove = getComputerMove();

                try {
                    String result = playRound(playerMove, computerMove);

                    if (result.equals("Player Wins")) wins++;
                    else if (result.equals("Computer Wins")) losses++;
                    else draws++;

                    System.out.printf("Player: %s, Computer: %s | Result: %s\n", playerMove, computerMove, result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage() + " - Try again.");
                    i--;
                }
            }

            double winPercentage = ((double) wins / totalRounds) * 100;
            System.out.println("\n--- Final Summary ---");
            System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, winPercentage);
            scanner.close();
        }
    }

