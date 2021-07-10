package Sudoku;

import Sudoku.New.SudokuNewApproach;

import java.util.Arrays;
import java.util.Random;

public class Sudoku {
    public static void main(String[] args) {

//        Board b = new Board(9, 9);
//        b.createBoard();
//        b.printBoard(b.sudokuBoard);
//        b.printBoard(b.createRandomColumn());
//        int[] a = {2,4,6,4};
//        int b1 =4;
//        System.out.println(b.pickedNumber(a,b1));

//        BoardStringVer bs = new BoardStringVer(9, 9);
//        bs.assignBoardValue();
//        bs.createBoard();
//        bs.printBoard();

        SudokuNewApproach sud = new SudokuNewApproach(9,20);
        sud.fillValues();
        sud.printBoard();
    }
}
