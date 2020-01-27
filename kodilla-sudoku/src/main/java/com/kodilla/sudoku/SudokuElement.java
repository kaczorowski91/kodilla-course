package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class SudokuElement {

    public static int EMPTY = -1;
    public int value;
    public List<Integer> listToSolve;

    public SudokuElement(int value, List<Integer> listToSolve) {
        this.value = value;
        this.listToSolve = listToSolve;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getListToSolve() {
        return listToSolve;
    }

    public void setListToSolve(List<Integer> listToSolve) {
        this.listToSolve = listToSolve;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SudokuElement)) return false;
        SudokuElement that = (SudokuElement) o;
        return getValue() == that.getValue() &&
                Objects.equals(getListToSolve(), that.getListToSolve());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getListToSolve());
    }
}
