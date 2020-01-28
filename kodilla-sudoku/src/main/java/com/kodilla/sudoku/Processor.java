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
        System.out.println("Welcome in Sudoku Game:");
        System.out.println("Instruction- will be later\n");
 //       System.out.println(sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(0).getValue());
        System.out.println(sudokuBoard + "\n");
    }

    public void game() {
        this.openGame();
        while (!this.changeValue) {
            this.changeValue();
        }
    }

    public void changeValue() {
        System.out.println("You Can set Value in Sudoku, First number-column, Second number-row, Third number - value");
        String userInput = scanner.nextLine();
        if (userInput.equals("SUDOKU")) {
            System.out.println("Make Algorithm");
            algorithm.solveSudoku();
            System.out.println(sudokuBoard);
            changeValue = true;
        } else {

            String[] splitValue = userInput.split(" ");

            int column = Integer.parseInt(splitValue[0]);
            int row = Integer.parseInt(splitValue[1]);
            int value = Integer.parseInt(splitValue[2]);

            sudokuBoard.getSudokuRowList().get(column - 1).sudokuElementList.get(row - 1).setValue(value);
            System.out.println(sudokuBoard);

            System.out.println("Algorithm solve");
            algorithm.findSolve();
            System.out.println("\n");
           // System.out.println(sudokuBoard + "\n");
        }
    }


}
