//package Sudoku.MultipleClassVers1;
//
//public class TestClass {
//    private BoardStringMVer[][] sudokuBoard;
//    private GenerateBoard generateBoard;
//
//    public TestClass(BoardStringMVer[][] sudokuBoard, GenerateBoard generateBoard){
//        this.sudokuBoard = sudokuBoard;
//        this.generateBoard =generateBoard;
//    }
//
//
//    public boolean isRow(String[] array, String generatedColumn) {
//        boolean res = true;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != null) {
//                if (array[i].equals(generatedColumn)) {
//                    res = false;
//                    break;
//                }
//            }
//        }
//        return res;
//    }
//
//    public boolean testVertical(int column, String number) {
//        for (int i = 0; i < sudokuBoard.length; i++) {
//            if (sudokuBoard[i][column].equals(number)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public boolean testHorizontal(int row, String number) {
//        for (int i = 0; i < sudokuBoard.length; i++) {
//            if (sudokuBoard[row][i].equals(number)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//}
