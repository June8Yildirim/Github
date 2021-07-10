//package Sudoku.MultipleClassVers1;
//
//import java.util.Random;
//
//public class BoardStringMVer {
//
//    Random rd = new Random();
//    int row =9;
//    int column =9;
//    private String[][] sudokuBoard;
//    private GenerateBoard generateBoard = new GenerateBoard(this, row ,column);
//    final int maxGeneratedColumn = 4;
//    TestClass testClass = new TestClass(this,generateBoard);
//
//
//    public BoardStringMVer() {
//        sudokuBoard = new String[row][column];
////        this.length = sudokuBoard.length;
//    }
//
//
//
//    public String[][] getSudokuBoard() {
//        return sudokuBoard;
//    }
//
//    public int getMaxGeneratedColumn() {
//        return maxGeneratedColumn;
//    }
//
//
//
//    private String[][] createBoard() {
//        String[][] usingColumn = generateBoard.createRandomColumn();
//        for (int i = 0; i < sudokuBoard.length; i++) {
//            int k = 0;
//            for (int j = 0; j < sudokuBoard.length; j++) {
//                if (k >= maxGeneratedColumn) {
//                    break;
//                } else {
//                    if (usingColumn[i][k].equals(String.valueOf(j))) {
//                        String generatedIndex = String.valueOf(rd.nextInt(9) + 1);
//                        if (!generateBoard.isOk(i, j, generatedIndex)) {
//                            sudokuBoard = generateBoard.createIndex(i, j);
//                            k++;
//                        } else {
//                            sudokuBoard[i][j] = generatedIndex;
//                            k++;
//                        }
//                    }
//                }
//            }
//        }
////        sudokuBoard
//    }
//
////        public boolean isColumn(String[][] columns, int row, String columnNumber){
////            int columnCount=0;
////            boolean columnOk= true;
////            int colNumber =Integer.parseInt(columnNumber);
////            for (int i = 1; i <columns.length ; i++) {
////                for (int j = colNumber; j < colNumber+1 ; j++) {
////                    if (columns[i][j] == columns[i-1][j]){
////                        columnCount++;
////                        if (columnCount>4){
////                            columnOk = false;
////                            return columnOk;
////                        }
////                    }
////                }
////            }
////            return columnOk;
////        }
//
//    private void printBoard() {
////        for (int[] s: sudokuBoard ) {
////            for (int t: s) {
////                System.out.print(t+",");
////            }
////            System.out.println();
////        }
//        System.out.println(" ____________  ___________  ___________");
//        for (int i = 0; i < sudokuBoard.length; i++) {
//            for (int j = 0; j < sudokuBoard.length; j++) {
//                if (j % 3 == 0 && j != 0) {
//                    System.out.print(" || " + sudokuBoard[i][j]);
//                } else if (j == 8) {
//                    System.out.print(" | " + sudokuBoard[i][j] + " |");
//                } else {
//                    System.out.print(" | " + sudokuBoard[i][j]);
//                }
//            }
//            System.out.println();
//            if (i == 2 || i == 5 || i == 8) {
//                System.out.println(" ____________  ___________  ___________");
//            }
//        }
//
//    }
//
//
//}
