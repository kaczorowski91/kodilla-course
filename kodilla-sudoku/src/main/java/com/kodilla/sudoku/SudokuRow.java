package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuRow {

    List<SudokuElement> sudokuElementList;
    List<Integer> listToSolve;

    public SudokuRow() {
        sudokuElementList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {

            listToSolve = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                listToSolve.add(j + 1);
            }
            sudokuElementList.add(new SudokuElement(SudokuElement.EMPTY, listToSolve));
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

    public List<Integer> getListToSolve() {
        return listToSolve;
    }

    @Override
    public String toString() {
        return sudokuElementList.stream()
                .map(SudokuElement::toString)
                .collect(Collectors.joining(" | "));
    }
}

