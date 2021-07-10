package Sudoku;

import java.util.Arrays;
import java.util.Random;

public class Board {
    int[][] sudokuBoard;
    //    int length;
    final int maxGeneratedColumn = 4;
    Random rd = new Random();

    public Board(int row, int column) {
        sudokuBoard = new int[row][column];
//        this.length = sudokuBoard.length;
    }


    public int[][] createBoard() {
        int[][] usingColumn = createRandomColumn();
        for (int i = 0; i < sudokuBoard.length; i++) {
            int k = 0;
            for (int j = 0; j < sudokuBoard.length; j++) {
                if (k >= maxGeneratedColumn) {
                    break;
                } else {
                    if (usingColumn[i][k] == j) {
                        int generatedIndex = rd.nextInt(9) + 1;
                        if (!isOk(i, j, generatedIndex)) {
                            sudokuBoard = createIndex(i, j, generatedIndex);
                            k++;
                        } else {
                            sudokuBoard[i][j] = generatedIndex;
                            k++;
                        }
                    }
                }
            }
        }
        return sudokuBoard;
    }


    public int[][] createRandomColumn() {
        int[][] columns = new int[sudokuBoard.length][4];
        for (int i = 0; i < sudokuBoard.length; i++) {
            for (int j = 0; j < maxGeneratedColumn; j++) {
                int generatedColumn = rd.nextInt(9);
//                if (isColumn(columns,i,generatedColumn)){
//                   continue;
//                }else{
//                    do {
//                        generatedColumn = rd.nextInt(9);
//                        isColumn(columns,i, generatedColumn);
//                    }while (isColumn(columns,i,generatedColumn));
//                }
                if (isRow(columns[i], generatedColumn)) {
                    columns[i][j] = generatedColumn;
                } else {
                    do {
                        generatedColumn = rd.nextInt(9);
                        isRow(columns[i], generatedColumn);
                    } while (!isRow(columns[i], generatedColumn));
                    columns[i][j] = generatedColumn;
                }

            }
            Arrays.sort(columns[i]);
        }
        return columns;
    }

    public boolean isColumn(int[][] columns, int row, int columnNumber){
        int columnCount=0;
        boolean columnOk= true;
        for (int i = 1; i <columns.length ; i++) {
            for (int j = columnNumber; j < columnNumber+1 ; j++) {
                if (columns[i][j] == columns[i-1][j]){
                    columnCount++;
                    if (columnCount>4){
                        columnOk = false;
                        return columnOk;
                    }
                }
            }
        }
        return columnOk;
    }

    public boolean isRow(int[] array, int generatedColumn) {
        boolean res = true;
        for (int i = 0; i < array.length; i++) {
            if (generatedColumn == array[i]) {
                res = false;
                break;
            }
        }
        return res;
    }
    public int[][] createIndex(int i, int j, int generatedIndex) {
//        generatedIndex= rd.nextInt(9) + 1;
//        generatedIndex = newIndex;
        int newIndex = rd.nextInt(9) + 1;
//        if (!isOk(i, j, generatedIndex)) {
//            createIndex(i, j, generatedIndex);
            while (!isOk(i, j, newIndex)) {
                newIndex = rd.nextInt(9) + 1;
//            }
        }
        sudokuBoard[i][j] = newIndex;
        return sudokuBoard;
    }




    public boolean isOk(int row, int column, int number) {
        return testVertical(column, number) && testHorizontal(row, number);
    }

    public boolean testVertical(int column, int number) {
        for (int i = 0; i < sudokuBoard.length; i++) {
            if (sudokuBoard[i][column] == number) {
                return false;
            }
        }
        return true;
    }

    public boolean testHorizontal(int row, int number) {
        for (int i = 0; i < sudokuBoard.length; i++) {
            if (number == sudokuBoard[row][i]) {
                return false;
            }
        }
        return true;
    }


    public void printBoard(int[][] sudokuBoard) {
//        for (int[] s: sudokuBoard ) {
//            for (int t: s) {
//                System.out.print(t+",");
//            }
//            System.out.println();
//        }
        System.out.println(" ____________  ___________  ___________");
        for (int i = 0; i < sudokuBoard.length; i++) {
            for (int j = 0; j < sudokuBoard[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print(" || " + sudokuBoard[i][j]);
                } else if (j == 8) {
                    System.out.print(" | " + sudokuBoard[i][j] + " |");
                } else {
                    System.out.print(" | " + sudokuBoard[i][j]);
                }
            }
            System.out.println();
            if (i == 2 || i == 5 || i == 8) {
                System.out.println(" ____________  ___________  ___________");
            }
        }

    }

}
