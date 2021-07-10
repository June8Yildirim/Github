package Sudoku;

import java.util.Arrays;
import java.util.Random;

public class BoardStringVer {
    String[][] sudokuBoard;
    //    int length;
    final int maxGeneratedColumn = 4;
    Random rd = new Random();

    public BoardStringVer(int row, int column) {
        sudokuBoard = new String[row][column];
//        this.length = sudokuBoard.length;
    }

    public void assignBoardValue() {
        for (int i = 0; i < sudokuBoard.length; i++) {
            for (int j = 0; j < sudokuBoard.length; j++) {
                sudokuBoard[i][j] = "-";
            }
        }
    }


    public void createBoard() {
        String[][] usingColumn = createRandomColumn();
        for (int i = 0; i < sudokuBoard.length; i++) {
            int k = 0;
            for (int j = 0; j < sudokuBoard.length; j++) {
                if (k >= maxGeneratedColumn) {
                    break;
                } else {
                    if (usingColumn[i][k].equals(String.valueOf(j))) {
                        String generatedIndex = String.valueOf(rd.nextInt(9) + 1);
                        if (!isOk(i, j, generatedIndex)) {
                            sudokuBoard = createIndex(i, j);
                            k++;
                        } else {
                            sudokuBoard[i][j] = generatedIndex;
                            k++;
                        }
                    }
                }
            }
        }
    }


    public String[][] createRandomColumn() {
        String[][] columns = new String[sudokuBoard.length][4];
        for (int i = 0; i < sudokuBoard.length; i++) {
            for (int j = 0; j < maxGeneratedColumn; j++) {
                String generatedColumn = Integer.toString(rd.nextInt(9));
//                    if (isColumn(columns,i,generatedColumn)){
//                        continue;
//                    }else{
//                        do {
//                            generatedColumn = Integer.toString(rd.nextInt(9));
//                            isColumn(columns,i, generatedColumn);
//                        }while (isColumn(columns,i,generatedColumn));
//                    }
                if (isRow(columns[i], generatedColumn)) {
                    columns[i][j] = generatedColumn;
                } else {
                    do {
                        generatedColumn = Integer.toString(rd.nextInt(9));
                        isRow(columns[i], generatedColumn);
                    } while (!isRow(columns[i], generatedColumn));
                    columns[i][j] = generatedColumn;
                }

            }
            Arrays.sort(columns[i]);
        }
        return columns;
    }

//        public boolean isColumn(String[][] columns, int row, String columnNumber){
//            int columnCount=0;
//            boolean columnOk= true;
//            int colNumber =Integer.parseInt(columnNumber);
//            for (int i = 1; i <columns.length ; i++) {
//                for (int j = colNumber; j < colNumber+1 ; j++) {
//                    if (columns[i][j] == columns[i-1][j]){
//                        columnCount++;
//                        if (columnCount>4){
//                            columnOk = false;
//                            return columnOk;
//                        }
//                    }
//                }
//            }
//            return columnOk;
//        }

    public boolean isRow(String[] array, String generatedColumn) {
        boolean res = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].equals(generatedColumn)) {
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    public String[][] createIndex(int i, int j) {

        String newIndex = Integer.toString(rd.nextInt(9) + 1);
        while (!isOk(i, j, newIndex)) {
            newIndex = Integer.toString(rd.nextInt(9) + 1);
        }
        sudokuBoard[i][j] = newIndex;
        return sudokuBoard;
    }


    public boolean isOk(int row, int column, String number) {
        return testVertical(column, number) && testHorizontal(row, number);
    }

    public boolean testVertical(int column, String number) {
        for (int i = 0; i < sudokuBoard.length; i++) {
            if (sudokuBoard[i][column].equals(number)) {
                return false;
            }
        }
        return true;
    }

    public boolean testHorizontal(int row, String number) {
        for (int i = 0; i < sudokuBoard.length; i++) {
            if (sudokuBoard[row][i].equals(number)) {
                return false;
            }
        }
        return true;
    }


    public void printBoard() {
//        for (int[] s: sudokuBoard ) {
//            for (int t: s) {
//                System.out.print(t+",");
//            }
//            System.out.println();
//        }
        System.out.println(" ____________  ___________  ___________");
        for (int i = 0; i < sudokuBoard.length; i++) {
            for (int j = 0; j < sudokuBoard.length; j++) {
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
