package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuRow {

    List<SudokuElement> sudokuElementList;

    public SudokuRow() {
        sudokuElementList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            sudokuElementList.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

    public SudokuRow(List<SudokuElement> sudokuElementList) {
        this.sudokuElementList = sudokuElementList;
    }

    public List<SudokuElement> getSudokuElementList() {
        return sudokuElementList;
    }

    public void setSudokuElementList(List<SudokuElement> sudokuElementList) {
        this.sudokuElementList = sudokuElementList;
    }

    @Override
    public String toString() {
        return sudokuElementList.stream()
                .map(SudokuElement::toString)
                .collect(Collectors.joining(" | "));
    }
}

