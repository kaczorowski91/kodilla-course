package com.kodilla.sudoku;

public class Algorithm {

    final SudokuBoard sudokuBoard;

    public Algorithm(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }


    public void check() {
        System.out.println(sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(0).listToSolve);
        System.out.println(sudokuBoard.getSudokuRowList().get(0).sudokuElementList.get(0));
    }

    public void solve() {
        System.out.println("SOLVE START");
        for (int i = 0; i < 9; i++) { //COLUMNS
            System.out.println("FIRST LOOP i=" + i);
            for (int j = 0; j < 9; j++) {
                System.out.println("SECOND LOOP i=" + i + " j=" + j);


                for (int k = 0 ; k < 9; k++) {
                    boolean check = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue() == -1;
                    System.out.println("i=" + i + " j=" + j + " k=" + k + " Is element Empy: " + check);
                    if (!check) {

                        Integer toRemove = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue();
                        System.out.println("FIELD HAS VALUE: " +toRemove);
                        sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(k).listToSolve.remove(toRemove);
                        System.out.println("LIST TO SOLVE: "+sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(k).listToSolve);

                    }
                }
            }

        }
    }


}


