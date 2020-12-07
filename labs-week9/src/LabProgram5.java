import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {

    /*
     * Write a program that gets a list of integers from input, and outputs the
     * integers in ascending order (lowest to highest). The first integer indicates
     * how many numbers are in the list. Assume that the list will always contain
     * less than 20 integers.
     *  Ex: If the input is 5 10 4 39 12 2, the output is:
     *   2 4 10 12 39
     */

    /* Define your method here */
    public static void SortArray(int[] userList, int numElements) {

        int tempValue;
        for (int k = 0; k < numElements - 1; k++) {
            for (int i = 0; i < numElements - 1; i++) {
                if (userList[i] > userList[i + 1]) {
                    tempValue = userList[i];
                    userList[i] = userList[i + 1];
                    userList[i + 1] = tempValue;
                }
            }
        }
        for (int l = 0; l < numElements; l++) {
            System.out.print(userList[l] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Type your code here. */

        Scanner scnr = new Scanner(System.in);

        int numElements;

        numElements = scnr.nextInt(); // Input begins with number of integers that follow

        int[] userList = new int[numElements];

        for (int i = 0; i < numElements; i++) {

            userList[i] = scnr.nextInt();

        }

        SortArray(userList, numElements);
    }
}
