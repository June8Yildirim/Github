package Robots;

import java.util.Random;

public class RobotTester {
    public static void main(String[] args) {

//        CleaningRobot ar = new CleaningRobot("R2D2",20,"test");
//
//        System.out.println(ar.getTypeOfCleaningFluid());
//        System.out.println(ar.getId());
//        System.out.println(ar.getId());
        int[][] test = new int[9][9];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < test.length; j++) {
                System.out.print(test[i][i]);
            }
        }
    }
}
