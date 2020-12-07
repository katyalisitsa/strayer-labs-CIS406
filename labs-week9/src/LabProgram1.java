import java.util.Scanner;

public class LabProgram1 {

    /*
     * Write a program that reads a list of integers, and outputs the two
     * smallest integers in the list, in ascending order. The input begins
     * with an integer indicating the number of integers that follow. You can
     * assume that the list will have at least 2 integers and less than 20 integers.
     * Ex: If the input is 5 10 5 3 21 2, the output is:
     *   2 3
     */

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int numElements;
        int tempValue;

        numElements = scnr.nextInt(); // Input begins with number of integers that follow

        int[] userList = new int[numElements];

        for (int i = 0; i < numElements; i++) {

            userList[i] = scnr.nextInt();

        }

        for (int k = 0; k < numElements - 1; k++) {
            for (int i = 0; i < numElements - 1; i++) {
                if (userList[i] > userList[i + 1]) {
                    tempValue = userList[i];
                    userList[i] = userList[i + 1];
                    userList[i + 1] = tempValue;
                }
            }
        }

        System.out.println(userList[0] + " " + userList[1]);


    }
}
