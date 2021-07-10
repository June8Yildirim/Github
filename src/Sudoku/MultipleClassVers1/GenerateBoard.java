//package Sudoku.MultipleClassVers1;
//
//import Sudoku.MultipleClassVers1.BoardStringMVer;
//import Sudoku.MultipleClassVers1.TestClass;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class GenerateBoard {
//    private BoardStringMVer[][] sudokuBoard;
//    private TestClass testClass;
//    public Random rd = new Random();
//
//    public GenerateBoard(BoardStringMVer[][] sudokuBoard, TestClass testClass){
//        this.sudokuBoard =sudokuBoard;
//        this.testClass =testClass;
//    }
//
//    public GenerateBoard(BoardStringMVer[][] sudokuBoard, int row, int column) {
//        this.sudokuBoard =sudokuBoard;
//
//    }
//
//    public void assignBoardValue() {
//        for (int i = 0; i < sudokuBoard.length; i++) {
//            for (int j = 0; j < sudokuBoard.length; j++) {
//                sudokuBoard[i][j] = "-";
//            }
//        }
//    }
//
//    public String[][] createIndex(int i, int j) {
//
//        String newIndex = Integer.toString(rd.nextInt(9) + 1);
//        while (!isOk(i, j, newIndex)) {
//            newIndex = Integer.toString(rd.nextInt(9) + 1);
//        }
//        sudokuBoard[i][j] = newIndex;
//        return sudokuBoard;
//    }
//
//
//    public boolean isOk(int row, int column, String number) {
//        return testClass.testVertical(column, number) && testClass.testHorizontal(row, number);
//    }
//
//
//    public String[][] createRandomColumn() {
//        String[][] columns = new String[sudokuBoard.length][4];
//        for (int i = 0; i < sudokuBoard.length; i++) {
//            for (int j = 0; j < sudokuBoard.getMaxGeneratedColumn(); j++) {
//                String generatedColumn = Integer.toString(rd.nextInt(9));
////                    if (isColumn(columns,i,generatedColumn)){
////                        continue;
////                    }else{
////                        do {
////                            generatedColumn = Integer.toString(rd.nextInt(9));
////                            isColumn(columns,i, generatedColumn);
////                        }while (isColumn(columns,i,generatedColumn));
////                    }
//                if (testClass.isRow(columns[i], generatedColumn)) {
//                    columns[i][j] = generatedColumn;
//                } else {
//                    do {
//                        generatedColumn = Integer.toString(rd.nextInt(9));
//                        testClass.isRow(columns[i], generatedColumn);
//                    } while (!testClass.isRow(columns[i], generatedColumn));
//                    columns[i][j] = generatedColumn;
//                }
//
//            }
//            Arrays.sort(columns[i]);
//        }
//        return columns;
//    }
//}
