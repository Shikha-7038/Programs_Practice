// 9. Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. 
//    Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. 
//    Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.


package Level2String;

import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int val = (int)(Math.random() * 3);
        if (val == 0) return "rock";
        if (val == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100) / games) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100) / games) + "%";

        return stats;
    }

    static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tPercentage");
        System.out.println("----------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("\nGame " + i + " - Enter rock, paper, or scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();

            String winner = findWinner(user, comp);

            System.out.println("Computer chose: " + comp);
            System.out.println("Winner: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, n);
        displayStats(stats);

        sc.close();
    }
}
