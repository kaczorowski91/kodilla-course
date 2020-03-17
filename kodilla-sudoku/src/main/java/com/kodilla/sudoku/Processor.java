package com.kodilla.sudoku;

import java.util.Scanner;

public class Processor {

    private final SudokuBoard sudokuBoard;

    private boolean changeValue = false;
    private String sudoku = "SUDOKU";
    public static int SIZE = 9;
    private final Algorithm algorithm;

    Scanner scanner = new Scanner(System.in);

    public Processor() {
        this.sudokuBoard = new SudokuBoard();
        this.algorithm = new Algorithm(sudokuBoard);
    }

    public void openGame() {
        System.out.println("Welcome in Sudoku Solution Program:");
        System.out.println("Instruction:\nIf you want solve sudoku, enter data first.");
        System.out.println("First number-column, Second number-row, Third number - value");
        System.out.println("For example 3 5 4  3-column number, 5-row number, 4-value in SUDOKU");
        System.out.println("When data are complete, write 'SUDOKU' to get solution of sudoku");
        System.out.println(sudokuBoard + "\n");
    }

    public void game() {
        this.openGame();
        while (!this.changeValue) {
            this.changeValue();
        }
    }

    public void changeValue() {
        String userInput = scanner.nextLine();
        String userInputToUpperCase = userInput.toUpperCase();

        try {
            if (userInputToUpperCase.equals("SUDOKU")) {
                algorithm.solveSudoku();
                System.out.println("Solution SUDOKU");
                System.out.println(sudokuBoard);
                changeValue = true;
            } else {

                String[] splitValue = userInput.split(" ");

                int column = Integer.parseInt(splitValue[0]);
                int row = Integer.parseInt(splitValue[1]);
                int value = Integer.parseInt(splitValue[2]);

                sudokuBoard.getSudokuRowList().get(column - 1).sudokuElementList.get(row - 1).setValue(value);
                System.out.println("Your values have been entered into sudoku. Column " + column + " Row " + row + " Value " + value);
                System.out.println(sudokuBoard);
            }
        } catch (NumberFormatException e) {
            System.out.println("The entered value is not correct. If you want solve sudoku-please write SUDOKU, " +
                    "If you want complete fields, please write: number of Column, number of Row, value in field");
        }

    }
}



