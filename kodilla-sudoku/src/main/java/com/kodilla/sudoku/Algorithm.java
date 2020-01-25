package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

    final SudokuBoard sudokuBoard;

    public Algorithm(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void createList(){
        for (int i=0;i<9;i++){
            sudokuBoard.getSudokuRowList().get(i);
/*                for (int j=0;j<9;j++){
                    sudokuBoard.getSudokuRowList().get(j).sudokuElementList.get(j);
                    List<Integer> field[i][j] = new ArrayList<>();
                    field
                }*/

        }
    }



}
