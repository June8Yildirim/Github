package Sudoku;

import java.util.Random;

public class TestingClass {
    public static void main(String[] args) {
        int[][] a = {
                {0, 0, 9, 0, 0, 8, 7, 4, 0},
                {0, 0, 0, 4, 0, 4, 0, 7, 3},
                {7, 0, 0, 7, 0, 4, 0, 5, 9},
                {1, 0, 1, 5, 0, 4, 0, 8, 0},
                {7, 3, 0, 0, 4, 7, 0, 0, 2},
                {0, 0, 8, 0, 0, 0, 2, 3, 9},
                {0, 0, 3, 0, 4, 1, 3, 0, 0},
                {0, 7, 0, 9, 4, 0, 0, 9, 0},
                {1, 7, 1, 6, 0, 5, 0, 0, 0}

        };

//
//        {0, 0, 0, 5, 4, 7, 0, 2, 0,},
//        {0, 3, 1, 1, 0, 0, 8, 0, 0},
//        {0, 0, 0, 4, 0, 0, 7, 7, 4},
//        {0, 0, 1, 6, 8, 0, 0, 0, 8},
//        {0, 4, 7, 0, 9, 3, 0, 0, 0},
//        {0, 0, 9, 9, 9, 0, 0, 1, 0},
//        {0, 0, 0, 5, 8, 0, 4, 3, 0},
//        {0, 4, 5, 0, 1, 0, 9, 0, 0},
//        {0, 8, 4, 0, 3, 4, 0, 0, 0}
        methods m = new methods();
        System.out.println(m.testHorizontal(0, 1));
        System.out.println(m.testHorizontal(1, 4));
        System.out.println(m.testHorizontal(2, 7));
        System.out.println(m.testHorizontal( 3, 1));
        System.out.println(m.testHorizontal( 4, 0));
        System.out.println(m.testHorizontal( 5, 3));
        System.out.println(m.testHorizontal(6, 3));
        System.out.println(m.testHorizontal( 7, 9));
        System.out.println(m.testHorizontal( 8, 1));
        System.out.println(m.testHorizontal( 0, 1));
        System.out.println(m.testHorizontal( 2, 0));
        System.out.println();
        System.out.println(m.testVertical(0,  7));
        System.out.println(m.testVertical( 1,  7));
        System.out.println(m.testVertical( 2,  1));
        System.out.println(m.testVertical( 3,  5));
        System.out.println(m.testVertical( 4,  4));
        System.out.println(m.testVertical( 5,  4));
        System.out.println(m.testVertical( 6, 2));
        System.out.println(m.testVertical( 7, 3));
        System.out.println(m.testVertical( 8, 9));
    }
}

class methods {
    Random rd = new Random();
    int[][] sudokuBoard = {
            {0, 0, 9, 0, 0, 8, 7, 4, 0},
            {0, 0, 0, 4, 0, 4, 0, 7, 3},
            {7, 0, 0, 7, 0, 4, 0, 5, 9},
            {1, 0, 1, 5, 0, 4, 0, 8, 0},
            {7, 3, 0, 0, 4, 7, 0, 0, 2},
            {0, 0, 8, 0, 0, 0, 2, 3, 9},
            {0, 0, 3, 0, 4, 1, 3, 0, 0},
            {0, 7, 0, 9, 4, 0, 0, 9, 0},
            {1, 7, 1, 6, 0, 5, 0, 0, 0}};

    public int[][] createIndex(int i, int j, int generatedIndex) {
        int newIndex = rd.nextInt(9) + 1;
        if (!isOk(i, j, generatedIndex)) {
            while (newIndex == generatedIndex) {
                newIndex = rd.nextInt(9) + 1;
            }
        }
        sudokuBoard[i][j] = newIndex;
        return sudokuBoard;
    }

    public boolean pickedNumber(int[] array, int generatedNumber) {
        boolean res = true;
        for (int i = 0; i < array.length; i++) {
            if (generatedNumber == array[i]) {
                res = false;
                break;
            }
        }
        return res;
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


    public void printBoard() {
        for (int[] s : sudokuBoard) {
            for (int t : s) {
                System.out.print(t + ",");
            }
            System.out.println();
        }
//    public boolean testVertical(int[][] sudokuBoard,int row,  int column, int number) {
//        boolean result = true;
//        int[] test = new int[sudokuBoard[row].length];
//        for (int i = 0; i < sudokuBoard.length; i++) {
//            for (int j = column; j <column+1 ; j++) {
//                test[i]= sudokuBoard[i][j];
//            }
//        }
//
//        for (int s: test ) {
//                System.out.print(s+",");
//        }
//        for (int i = 0; i < test.length ; i++) {
//            if (number == test[i]) {
//                result = false;
////                System.out.println(test[i]);
//                break;
//            }
//        }
//        return result;
//    }
//
//
//    public boolean testHorizontal(int[][] sudokuBoard, int row, int number) {
//        boolean result = true;
//        int[] test = sudokuBoard[row];
//        for (int i = 0; i < test.length ; i++) {
//            if (number == test[i]) {
//                result = false;
//                System.out.println(test[i]);
//                break;
//            }
//        }
//        return result;
//    }
//
//
//
//    public boolean pickedNumber(int[] array, int generatedNumber) {
//        boolean res = true;
//        for (int i = 0; i < array.length; i++) {
//            if (generatedNumber == array[i]) {
//                res = false;
//                break;
//            }
//        }
//        return res;
//    }
    }
}
