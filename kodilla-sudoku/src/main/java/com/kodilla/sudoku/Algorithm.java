package com.kodilla.sudoku;

public class Algorithm {

    final SudokuBoard sudokuBoard;

    public Algorithm(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void findSolve() {

        for (int i = 0; i < Processor.SIZE; i++) {

            for (int j = 0; j < Processor.SIZE; j++) {

                boolean check = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue() == -1;
                Integer toRemove = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue();
                if (!check) {
                    for (int k = 0; k < Processor.SIZE; k++) {
                        sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(k).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(k).sudokuElementList.get(j).listToSolve.remove(toRemove);
                    }
                   if(i%3==0&&j%3==0){
                           sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                           sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j+2).listToSolve.remove(toRemove);
                           sudokuBoard.getSudokuRowList().get(i+2).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                           sudokuBoard.getSudokuRowList().get(i+2).sudokuElementList.get(j+2).listToSolve.remove(toRemove);
                   }
                   if(i%3==0&&j%3==1){
                       sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                       sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                       sudokuBoard.getSudokuRowList().get(i+2).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                       sudokuBoard.getSudokuRowList().get(i+2).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                   }
                   if(i%3==0&&j%3==2){
                       sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j-2).listToSolve.remove(toRemove);
                       sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                       sudokuBoard.getSudokuRowList().get(i+2).sudokuElementList.get(j-2).listToSolve.remove(toRemove);
                       sudokuBoard.getSudokuRowList().get(i+2).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                   }
                    if(i%3==1&&j%3==0){
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j+2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j+2).listToSolve.remove(toRemove);
                    }
                    if(i%3==1&&j%3==1){
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                    }
                    if(i%3==1&&j%3==2){
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j-2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j-2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i+1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                    }
                    if(i%3==2&&j%3==0){
                        sudokuBoard.getSudokuRowList().get(i-2).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-2).sudokuElementList.get(j+2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j+2).listToSolve.remove(toRemove);
                    }
                    if(i%3==2&&j%3==1){
                        sudokuBoard.getSudokuRowList().get(i-2).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-2).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j+1).listToSolve.remove(toRemove);
                    }
                    if(i%3==2&&j%3==2){
                        sudokuBoard.getSudokuRowList().get(i-2).sudokuElementList.get(j-2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-2).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j-2).listToSolve.remove(toRemove);
                        sudokuBoard.getSudokuRowList().get(i-1).sudokuElementList.get(j-1).listToSolve.remove(toRemove);
                    }

                }
            }

        }
        for (int i = 0; i < Processor.SIZE; i++) {
            for (int j = 0; j < Processor.SIZE; j++) {
                if((sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve.size()==1)
                        &&((sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue()==-1)))
                System.out.println("In Field =" + (i+1) +","+ (j+1) + " Should write" + sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve);
            }
        }
    }

    public void solveSudoku(){

        for (int i = 0; i < Processor.SIZE; i++) {

            for (int j = 0; j < Processor.SIZE; j++) {

                boolean check1 = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve.size()==1;
                boolean check2 = sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).getValue()
                if(check1){
                    sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).value=
                            sudokuBoard.getSudokuRowList().get(i).sudokuElementList.get(j).listToSolve.get(0);
                    System.out.println("SOLVE START");
                }


            }

        }
    }

}


