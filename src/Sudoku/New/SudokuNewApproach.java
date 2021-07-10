package Sudoku.New;

import java.util.Arrays;
import java.util.Random;

public class SudokuNewApproach {

    int[][] board;
    private int row;
    private int col;
    int SRN;
    int K;
    Random rd = new Random();

    public SudokuNewApproach(int row, int K) {
        this.col = row;
        this.row = row;
        this.K = K;
        Double SRNd = Math.sqrt(row);
        SRN = SRNd.intValue();
        board = new int[this.row][this.col];
    }


    public void fillValues() {
        fillDiagonal();

        fillRemaining(0, SRN);

        removeDigits();
    }


    public void fillDiagonal() {

        for (int i = 0; i < row; i =i+ SRN) {
            fillBox(i, i);
        }
    }

    public void fillBox(int row, int col) {
        int num;
        for (int i = 0; i < SRN; i++) {
            for (int j = 0; j < SRN; j++) {
                do {
                    num = randomGenerator(row);
                } while (!isOk(row, col, num));
                board[row+i][col+j]= num;
            }
        }
    }

    public int randomGenerator(int num) {
        return (int) Math.floor(Math.random() * num + 1);
    }

    public boolean isColumn(int j, int index) {
        int columnCount = 0;
        boolean columnOk = true;
        for (int i = 0; i < row; i++) {
            if (board[i][j] == index) {
                columnOk = false;
            }
        }
        return columnOk;
    }

    public boolean isRow(int i, int index) {
        boolean res = true;
        for (int j = 0; i < row; i++) {
            if (board[i][j] == index) {
                res = false;
                break;
            }
        }
        return res;
    }

    public boolean isBox(int rowStart, int colStart, int number) {
        boolean boxOk = true;
        for (int i = 0; i < SRN; i++) {
            for (int j = 0; j < SRN; j++) {
                if (board[rowStart + 1][colStart + 1] == number) {
                    boxOk = false;
                }
            }
        }
        return boxOk;
    }


    public boolean isOk(int row, int column, int number) {
        return (isColumn(column, number)) && (isRow(row, number) && isBox(row - row % SRN, column - column % SRN, number));
    }


    public boolean fillRemaining(int i, int j){
        boolean result = false;
        if (j>= row && i < row){
            i +=1;
            j=0;
        }
        if (i>= row && j>= row){
            result = true;
        }
        if (i<SRN){
            if (j<SRN){
                j=SRN;
            }
        }else if (i<row - SRN){
            if (j == (int)(i/SRN)*SRN){
                j+=SRN;
            }
        }else {
            if (j == row - SRN){
                i +=1;
                j=0;
                if (i>=row){
                    result= true;
                }
            }
        }
        return result;
    }

    public void  removeDigits(){
        int count = K;
        while (count != 0){
            int cellId = randomGenerator(row*row)-1;

            int i = (cellId /row);
            int j = cellId%9;
            if (j != 0){
                j -=1;
            }
            if (board[i][j] != 0){
                count--;
                board[i][j]=0;
            }
        }
    }
//    public int[][] createIndex(int i, int j, int generatedIndex) {
////        generatedIndex= rd.nextInt(9) + 1;
////        generatedIndex = newIndex;
//        int newIndex = rd.nextInt(9) + 1;
////        if (!isOk(i, j, generatedIndex)) {
////            createIndex(i, j, generatedIndex);
//        while (!isOk(i, j, newIndex)) {
//            newIndex = rd.nextInt(9) + 1;
////            }
//        }
//        board[i][j] = newIndex;
//        return board;
//    }


//
//    public boolean testVertical(int column, int number) {
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][column] == number) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public boolean testHorizontal(int row, int number) {
//        for (int i = 0; i < board.length; i++) {
//            if (number == board[row][i]) {
//                return false;
//            }
//        }
//        return true;
//    }


    public void printBoard() {
//        for (int[] s: sudokuBoard ) {
//            for (int t: s) {
//                System.out.print(t+",");
//            }
//            System.out.println();
//        }
        System.out.println(" ____________  ___________  ___________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    if (board[i][j] != -1) {
                        System.out.print(" || " + board[i][j]);
                    } else {
                        System.out.print(" || " + 0);
                    }
                } else if (j == 8) {
                    if (board[i][j] != -1) {
                        System.out.print(board[i][j] + " |");
                    } else {
                        System.out.print(" | " + 0 + " | ");
                    }
                } else {
                    if (board[i][j] != -1) {
                        System.out.print(" | " + board[i][j]);
                    } else {
                        System.out.print(" | " + 0);
                    }
                }
            }
            System.out.println();
            if (i == 2 || i == 5 || i == 8) {
                System.out.println(" ____________  ___________  ___________");
            }
        }

    }

}