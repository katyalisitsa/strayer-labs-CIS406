import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram2 {

    /*
     * Write a program that first gets a list of integers from input.
     * The input begins with an integer indicating the number of integers
     * that follow. Then, get the last value from the input, and output all integers
     * less than or equal to that value. Assume that the list will always contain
     * less than 20 integers.
     * Ex: If the input is 5 50 60 140 200 75 100, the output is:
     * 50 60 75
     * The 5 indicates that there are five integers in the list, namely 50, 60, 140, 200, and 75.
     * The 100 indicates that the program should output all integers less than or equal to 100,
     * so the program outputs 50, 60, and 75.
     */

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int numElements;

        numElements = scnr.nextInt(); // Input begins with number of integers that follow

        int[] userList = new int[numElements];
        int lastInt;
        int lessThen;


        for (int i = 0; i < numElements; i++) {

            userList[i] = scnr.nextInt();

        }

        lastInt = userList[numElements - 1];

        for (int k = 0; k < (numElements - 1); k++) {
            if (userList[k] <= lastInt) {
                System.out.print(userList[k] + " ");
            }
        }
        System.out.println();
    }

}
