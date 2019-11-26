package com.kodilla.rps;


import java.util.Scanner;

public class GameLoop {
    boolean end = false;
    boolean newgame = false;
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int playerScore = 0;
    int computerScore = 0;
    MoveGenerator moveGenerator = new MoveGenerator();

    public void gameRun() {

        while (!newgame) {
            end = false;
            System.out.println("Hello, Please give your name: ");
            String name = sc.nextLine();
            System.out.println("Welcome " + name + " How many rounds do you want play to win? ");
            int rounds = sc.nextInt();
            System.out.println("Rules of Game: ");
            System.out.println("1 - Rock, 2 - Paper, 3 -Scissors");
            System.out.println("Rock bests Scissors, Scissors beats Paper, Paper beats Rock");
            System.out.println("X - End of Game, N - New Game");
            System.out.println("We play to " + rounds + " wins rounds");

            while (!end) {
                System.out.println("Score: ");
                System.out.println("Player Score: " + playerScore);
                System.out.println("Computer Score: " + computerScore);
                System.out.println("Round " + i);
                System.out.println("Choose thing: 1 - Rock, 2 - Paper, 3 -Scissors");
                String choice = sc.nextLine();

                int computerPick = moveGenerator.moveGenerator();

                if (choice.equals("1")) {
                    System.out.println("Your choice is a Rock");

                    if (computerPick == 1) {
                        System.out.println("Computer pick Rock. It's draw.");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);

                    } else if (computerPick == 2) {
                        computerScore++;
                        System.out.println("Computer pick Paper. You lose.");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);

                    } else if (computerPick == 3) {
                        playerScore++;
                        System.out.println("Computer pick Scissors. You win.");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);
                    }

                } else if (choice.equals("2")) {
                    System.out.println("Your choice is Paper");

                    if (computerPick == 1) {
                        playerScore++;
                        System.out.println("Computer pick Rock. You win");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);

                    } else if (computerPick == 2) {
                        System.out.println("Computer pick Paper. It's draw.");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);
                    } else if (computerPick == 3) {
                        System.out.println("Computer pick Scissors. You lose.");
                        computerScore++;
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);
                    }


                } else if (choice.equals("3")) {
                    System.out.println("Your choice is Scissors");

                    if (computerPick == 1) {
                        computerScore++;
                        System.out.println("Computer pick Rock. You lose");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);

                    } else if (computerPick == 2) {
                        playerScore++;
                        System.out.println("Computer pick Paper. You win.");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);
                    } else if (computerPick == 3) {
                        System.out.println("Computer pick Scissors. It's draw.");
                        System.out.println("End of Round " + i);
                        System.out.println("Player Score: " + playerScore);
                        System.out.println("Computer Score: " + computerScore);
                    }
                } else if (choice.equals("N") || (choice.equals("n"))) {
                    System.out.println("New Game");
                    end = true;
                } else if (choice.equals("X") || (choice.equals("x"))) {
                    System.out.println("End Game");
                    end = true;
                    newgame = true;
                }
                i++;

                if (playerScore == rounds) {
                    System.out.println("You win a GAME! CONGRATULATION! ");
                    end = true;
                    newgame = true;
                }
                if (computerScore == rounds) {
                    System.out.println("You lose ... ");
                    end = true;
                    newgame = true;
                }
            }
        }
    }


}
