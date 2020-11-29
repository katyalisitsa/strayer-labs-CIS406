import java.util.Scanner;

public class LabProgram1 {

    /*
     * Write a program that reads a list of integers,
     * and outputs those integers in reverse.
     * The input begins with an integer indicating the number
     * of integers that follow. For coding simplicity, follow each
     * output integer by a space, including the last one.
     * Assume that the list will always contain less than 20 integers.
     * Ex: If the input is 5 2 4 6 8 10, the output is:
     * 10 8 6 4 2
     */


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int numElements;

        numElements = scnr.nextInt(); // Input begins with number of integers that follow

        int[] userList = new int[numElements];

        int tempVal;

        for (int i = 0; i < numElements; i++) {

            userList[i] = scnr.nextInt();

        }

        for (int i = 0; i < numElements / 2; i++) {
            tempVal = userList[i];
            userList[i] = userList[userList.length - 1 - i];
            userList[userList.length - 1 - i] = tempVal;
        }

        for (int i = 0; i < numElements; i++) {
            System.out.print(userList[i] + " ");
        }
        System.out.println();


    }
}
