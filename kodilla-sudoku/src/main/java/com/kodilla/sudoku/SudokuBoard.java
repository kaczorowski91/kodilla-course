package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SudokuBoard {

    private List<SudokuRow> sudokuRowList;

    public SudokuBoard() {
        this.sudokuRowList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
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
}



