package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SudokuBoard extends Prototype {

    private List<SudokuRow> sudokuRowList;

    public SudokuBoard() {
        this.sudokuRowList = new ArrayList<>();
        for (int i = 0; i < Processor.SIZE; i++) {
            sudokuRowList.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getSudokuRowList() {
        return sudokuRowList;
    }

    @Override
    public String toString() {
        return sudokuRowList.stream()
                .map(SudokuRow::toString)
                .collect(Collectors.joining("\n"));
    }


    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedSudokuBoard = (SudokuBoard) super.clone();
        clonedSudokuBoard.sudokuRowList = new ArrayList<>();

        for (SudokuRow theSudokuRowList : sudokuRowList) {
            SudokuRow clonedSudokuRowList = new SudokuRow();
            for (SudokuElement sudokuElement : theSudokuRowList.getSudokuElementList()) {

                clonedSudokuRowList.getSudokuElementList().add(sudokuElement);
            }
            clonedSudokuBoard.getSudokuRowList().add(clonedSudokuRowList);
        }
        return clonedSudokuBoard;
    }
}



