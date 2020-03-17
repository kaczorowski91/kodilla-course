package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuTestSuite {

    @Test
    public void Test1() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        Algorithm algorithm = new Algorithm(sudokuBoard);
        Processor processor = new Processor();
        SudokuGame sudokuGame = new SudokuGame();
        //Then
        System.out.println("Sudoku board, before entered data");
        System.out.println(sudokuBoard);
        System.out.println();

        sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(0).setValue(2);
        sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(2).setValue(6);
        sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(3).setValue(8);
        sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(4).setValue(3);
        sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(7).setValue(1);
        sudokuBoard.getSudokuRowList().get(1).sudokuElementList.get(0).setValue(5);
        sudokuBoard.getSudokuRowList().get(1).sudokuElementList.get(3).setValue(7);
        sudokuBoard.getSudokuRowList().get(1).sudokuElementList.get(6).setValue(4);
        sudokuBoard.getSudokuRowList().get(1).sudokuElementList.get(7).setValue(2);
        sudokuBoard.getSudokuRowList().get(2).sudokuElementList.get(0).setValue(1);
        sudokuBoard.getSudokuRowList().get(2).sudokuElementList.get(3).setValue(9);
        sudokuBoard.getSudokuRowList().get(2).sudokuElementList.get(4).setValue(2);
        sudokuBoard.getSudokuRowList().get(2).sudokuElementList.get(6).setValue(8);
        sudokuBoard.getSudokuRowList().get(2).sudokuElementList.get(7).setValue(7);
        sudokuBoard.getSudokuRowList().get(2).sudokuElementList.get(8).setValue(6);
        sudokuBoard.getSudokuRowList().get(3).sudokuElementList.get(0).setValue(9);
        sudokuBoard.getSudokuRowList().get(3).sudokuElementList.get(4).setValue(1);
        sudokuBoard.getSudokuRowList().get(3).sudokuElementList.get(5).setValue(7);
        sudokuBoard.getSudokuRowList().get(3).sudokuElementList.get(7).setValue(5);
        sudokuBoard.getSudokuRowList().get(4).sudokuElementList.get(1).setValue(5);
        sudokuBoard.getSudokuRowList().get(4).sudokuElementList.get(3).setValue(3);
        sudokuBoard.getSudokuRowList().get(5).sudokuElementList.get(0).setValue(3);
        sudokuBoard.getSudokuRowList().get(5).sudokuElementList.get(1).setValue(2);
        sudokuBoard.getSudokuRowList().get(5).sudokuElementList.get(5).setValue(8);
        sudokuBoard.getSudokuRowList().get(5).sudokuElementList.get(6).setValue(6);
        sudokuBoard.getSudokuRowList().get(5).sudokuElementList.get(8).setValue(1);
        sudokuBoard.getSudokuRowList().get(6).sudokuElementList.get(1).setValue(4);
        sudokuBoard.getSudokuRowList().get(6).sudokuElementList.get(2).setValue(2);
        sudokuBoard.getSudokuRowList().get(6).sudokuElementList.get(4).setValue(5);
        sudokuBoard.getSudokuRowList().get(6).sudokuElementList.get(7).setValue(3);
        sudokuBoard.getSudokuRowList().get(7).sudokuElementList.get(1).setValue(9);
        sudokuBoard.getSudokuRowList().get(7).sudokuElementList.get(3).setValue(4);
        sudokuBoard.getSudokuRowList().get(7).sudokuElementList.get(4).setValue(7);
        sudokuBoard.getSudokuRowList().get(7).sudokuElementList.get(5).setValue(3);
        sudokuBoard.getSudokuRowList().get(8).sudokuElementList.get(1).setValue(1);
        sudokuBoard.getSudokuRowList().get(8).sudokuElementList.get(2).setValue(3);
        sudokuBoard.getSudokuRowList().get(8).sudokuElementList.get(4).setValue(8);
        sudokuBoard.getSudokuRowList().get(8).sudokuElementList.get(5).setValue(2);
        sudokuBoard.getSudokuRowList().get(8).sudokuElementList.get(6).setValue(9);
        sudokuBoard.getSudokuRowList().get(8).sudokuElementList.get(8).setValue(5);

        System.out.println("Sudoku board, with entered date");
        System.out.println(sudokuBoard);
        System.out.println();
        algorithm.solveSudoku();
        System.out.println("Sudoku board, after solve algorithm");
        System.out.println(sudokuBoard);
        /*  Data to copy sudoku, after program run
1 1 2
1 3 6
1 4 8
1 5 3
1 8 1
2 1 5
2 4 7
2 7 4
2 8 2
3 1 1
3 4 9
3 5 2
3 7 8
3 8 7
3 9 6
4 1 9
4 5 1
4 6 7
4 8 5
5 2 5
5 4 3
6 1 3
6 2 2
6 6 8
6 7 6
6 9 1
7 2 4
7 3 2
7 5 5
7 8 3
8 2 9
8 4 4
8 5 7
8 6 3
9 2 1
9 3 3
9 5 8
9 6 2
9 7 9
9 9 5
        */

        //When
        Assert.assertEquals(1, sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(1).getValue());
        Assert.assertEquals(9, sudokuBoard.getSudokuRowList().get(1).sudokuElementList.get(2).getValue());
        Assert.assertEquals(3, sudokuBoard.getSudokuRowList().get(2).sudokuElementList.get(1).getValue());
        Assert.assertEquals(4, sudokuBoard.getSudokuRowList().get(3).sudokuElementList.get(8).getValue());
        Assert.assertEquals(9, sudokuBoard.getSudokuRowList().get(4).sudokuElementList.get(4).getValue());
        Assert.assertEquals(7, sudokuBoard.getSudokuRowList().get(5).sudokuElementList.get(2).getValue());
        Assert.assertEquals(8, sudokuBoard.getSudokuRowList().get(6).sudokuElementList.get(8).getValue());
        Assert.assertEquals(1, sudokuBoard.getSudokuRowList().get(7).sudokuElementList.get(6).getValue());
        Assert.assertEquals(4, sudokuBoard.getSudokuRowList().get(8).sudokuElementList.get(7).getValue());

    }
}
