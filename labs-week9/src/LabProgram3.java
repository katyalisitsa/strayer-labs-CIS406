import java.util.Scanner;

public class LabProgram3 {

    /*
     * Write a program that reads a list of integers, and outputs whether the
     * list contains all even numbers, odd numbers, or neither. The input begins
     * with an integer indicating the number of integers that follow. Assume that
     * the list will always contain less than 20 integers.
     * Ex: If the input is 5 2 4 6 8 10, the output is:
     *   all even
     * Ex: If the input is 5 1 3 5 7 9, the output is:
     *   all odd
     * Ex: If the input is 5 1 2 3 4 5, the output is:
     *   not even or odd*/

    /* Define your method here */

    public static boolean IsArrayEven(int[] arrayValues, int arraySize) {
        boolean isArrayEven = true;
        for (int i = 0; i < arraySize; i++) {
            if ((arrayValues[i] % 2 != 0) && (isArrayEven)) {
                isArrayEven = false;
            }
        }
        return isArrayEven;
    }

    public static boolean IsArrayOdd(int[] arrayValues, int arraySize) {
        boolean isArrayOdd = true;
        for (int i = 0; i < arraySize; i++) {
            if ((arrayValues[i] % 2 != 1) && (isArrayOdd)) {
                isArrayOdd = false;
            }
        }
        return isArrayOdd;
    }

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        int numElements;

        numElements = scnr.nextInt(); // Input begins with number of integers that follow

        int[] userList = new int[numElements];


        for (int i = 0; i < numElements; i++) {

            userList[i] = scnr.nextInt();

        }

        if (IsArrayEven(userList, numElements)) {
            System.out.println("all even");
        } else if (IsArrayOdd(userList, numElements)) {
            System.out.println("all odd");
        } else {
            System.out.println("not even or odd");
        }

    }
}
