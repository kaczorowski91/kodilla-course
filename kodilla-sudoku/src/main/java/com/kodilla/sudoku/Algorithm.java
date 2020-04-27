package com.kodilla.sudoku;

public class Algorithm {

    final SudokuBoard sudokuBoard;

    public Algorithm(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void solveSudoku() {
        for (int i = 0; i < ((Processor.SIZE * Processor.SIZE)); i++) {
            this.findValueInFieldColumnAndRow();
            this.findValueInOthersColumnAndRow();
        }

        if (!this.checkSudokuSolved()) {
            try {
                System.out.println("Sudoku can't be solved - insufficient data ");
                System.out.println("DEEP COPY Algorithm after check");
                SudokuBoard deepCopySudokuBoards = sudokuBoard.deepCopy();
                System.out.println(deepCopySudokuBoards);
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }

        }
    }

    public boolean checkSudokuSolved() {
        boolean sudokuSolved = true;

        for (int i = 0; i < Processor.SIZE; i++) {
            for (int j = 0; j < Processor.SIZE; j++) {

                while (sudokuSolved) {
                    if (sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue() == -1) {
                        sudokuSolved = false;

                    }
                }
            }
        }
        return sudokuSolved;
    }


    public void findValueInFieldColumnAndRow() {

        boolean endSolution = false;

        while (!endSolution) {

            for (int i = 0; i < Processor.SIZE; i++) {

                for (int j = 0; j < Processor.SIZE; j++) {

                    boolean check1 = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve.size() == 1;
                    boolean check2 = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue() == -1;

                    if (check1 && check2) {
                        int solve = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getListToSolve().get(0);
                        sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).setValue(solve);

                        i = 0;
                        j = 0;
                        this.removeValueFromListToSolve();
                    }
                }
                endSolution = true;
            }
        }
    }

    public void findValueInOthersColumnAndRow() {// Find unique value, through reviewing other fields in row and column and check that, they may have this value. If other fields count have this value, put it in correct field.

        for (int i = 0; i < Processor.SIZE; i++) {  //Column number

            for (int j = 0; j < Processor.SIZE; j++) { //Row number

                if (sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue() == -1) {   // Check that field [i,j] is empty?

                    for (int k = 0; k < sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve.size(); k++) { // Loop for solveList in field

                        int valueToSolve = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve.get(k);// Get value from solveList

                        int rowCounter = 0;
                        int columnCounter = 0;

                        for (int l = 0; l < Processor.SIZE; l++) {    //For every field in row

                            if (sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(l).getListToSolve().contains(valueToSolve)) {//check for this value is unique value in row.
                                rowCounter++;
                            }
                        }
                        if (rowCounter == 1) {
                            sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).setValue(valueToSolve);
                        }

                        for (int l = 0; l < Processor.SIZE; l++) {    //For every field in column

                            if (sudokuBoard.getSudokuRowList().get(l).sudokuElementList.get(j).getListToSolve().contains(valueToSolve)) {//check for this value is unique value in row.
                                columnCounter++;
                                this.removeValueFromListToSolve();

                            }
                        }
                        if (columnCounter == 1) {
                            sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).setValue(valueToSolve);
                            this.removeValueFromListToSolve();

                        }
                    }
                }
            }
        }
    }

    public void removeValueFromListToSolve() { //Remove correct value from solution list others fields in rows, columns and squares.

        for (int i = 0; i < Processor.SIZE; i++) {

            for (int j = 0; j < Processor.SIZE; j++) {

                boolean isFieldEmpty = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue() == -1;
                Integer toRemove = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue();

                if (!isFieldEmpty) {
                    sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve.clear();

                    for (int k = 0; k < Processor.SIZE; k++) {
                        sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(k).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(k).sudokuElementList.get(j).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 0 && j % 3 == 0) {
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j + 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 2).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 2).sudokuElementList.get(j + 2).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 0 && j % 3 == 1) {
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 2).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 2).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 0 && j % 3 == 2) {
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j - 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 2).sudokuElementList.get(j - 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 2).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 1 && j % 3 == 0) {
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j + 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j + 2).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 1 && j % 3 == 1) {
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 1 && j % 3 == 2) {
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j - 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j - 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i + 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 2 && j % 3 == 0) {
                        sudokuBoard.getSudokuRowList().get(i - 2).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 2).sudokuElementList.get(j + 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j + 2).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 2 && j % 3 == 1) {
                        sudokuBoard.getSudokuRowList().get(i - 2).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 2).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j + 1).listToSolve.remove(toRemove);
                    }
                    if (i % 3 == 2 && j % 3 == 2) {
                        sudokuBoard.getSudokuRowList().get(i - 2).sudokuElementList.get(j - 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 2).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j - 2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i - 1).sudokuElementList.get(j - 1).listToSolve.remove(toRemove);
                    }
                }
            }
        }
    }


}







