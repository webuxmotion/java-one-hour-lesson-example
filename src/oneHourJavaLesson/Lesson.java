package oneHourJavaLesson;

import java.util.Scanner;

public class Lesson {

    static void arrayLesson() {
        int[] arr = new int[]{10, 20, 30};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " is " + arr[i]);
        }
    }

    static void array2DLesson() {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Element " + j + " in array " + i + " is " + arr[i][j]);
            }
        }
    }

    static void loopWhile() {
        int speed = 0;
        while (speed <= 90) {
            System.out.println("Battery is OK, when speed equal: " + speed);
            speed++;
        }
    }

    static void loopDoWhile() {
        int speed = 100;
        do {
            System.out.println("Speed equal: " + speed);
            speed++;
        } while (speed <= 90);
    }

    static void switchCase() {
        int num = 59;
        switch (num) {
            case 50:
                System.out.print("Num is 50");
                break;
            case 100:
                System.out.println("Num is 100");
                break;
            default:
                System.out.println("Default case: Num is unknown");
        }
    }

    static void scanLesson() {
        Scanner scan = new Scanner(System.in);
        int year;
        year = scan.nextInt();
        System.out.print("Year: " + year);
    }
}
