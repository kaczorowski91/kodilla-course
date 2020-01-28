package com.kodilla.sudoku;

import org.junit.Test;

public class SudokuTestSuite {

    @Test
    public void Test1(){
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        Algorithm algorithm = new Algorithm(sudokuBoard);
        Processor processor = new Processor();
        processor.game();
    }
        //Then

}
