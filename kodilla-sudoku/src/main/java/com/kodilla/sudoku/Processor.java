package com.kodilla.sudoku;

import java.util.Scanner;

public class Processor {

    private SudokuBoard sudokuBoard;

    private int column;
    private int row;
    private int value;
    private boolean changeValue=false;
    private String sudoku="SUDOKU";
    public static int SIZE;

    Scanner scanner = new Scanner(System.in);

    public Processor() {
        this.sudokuBoard = new SudokuBoard();
    }

    public void openGame() {
        System.out.println("Welcome in Sudoku Game:");
        System.out.println("Instruction- will be later\n");
       // System.out.println("Please give size of Sudoku");
      //  int SIZE=scanner.nextInt();
        System.out.println(sudokuBoard+"\n");
    }

    public void game() {
        this.openGame();
        while(!this.changeValue) {
            this.changeValue();
        }
    }

    public void changeValue() {
        System.out.println("You Can set Value in Sudoku, First number-column, Second number-row, Third number - value");
/*        if(scanner.nextLine().equals("SUDOKU")){
            System.out.println("Make Algorithm");
        }*/
        column = scanner.nextInt();
        row = scanner.nextInt();
        value = scanner.nextInt();

        sudokuBoard.getSudokuRowList().get(column-1).sudokuElementList.get(row-1).setValue(value);
        System.out.println(sudokuBoard);


    }


}
