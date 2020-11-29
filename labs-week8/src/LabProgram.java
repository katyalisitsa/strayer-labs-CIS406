
import java.util.Scanner;

public class LabProgram {

    /*
     * Write a program that first gets a list of integers from input.
     * The input begins with an integer indicating the number of integers
     * that follow. Assume that the list will always contain less than 20 integers.
     * That list is followed by two more integers representing lower and upper bounds
     * of a range. Your program should output all integers from the list that are within
     * that range (inclusive of the bounds). For coding simplicity, follow each output integer
     * by a space, even the last one.
     * Ex: If the input is:
     *   5 25 51 0 200 33
     *   0 50
     *then the output is:
     *   25 0 33
     * (the bounds are 0-50, so 51 and 200 are out of range and thus not output).
     * */

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String userInput;
        String userInput2;
        int arraySize;
        int lowerBound;
        int upperbound;

        userInput = scnr.nextLine();
        String[] userArray = userInput.split(" ");

        userInput2 = scnr.nextLine();
        String[] userArray2 = userInput2.split(" ");

        lowerBound = Integer.parseInt(userArray2[0]);
        upperbound = Integer.parseInt(userArray2[1]);

        for (int i = 1; i < userArray.length; i++) {
            if ((Integer.parseInt(userArray[i]) >= lowerBound) && (Integer.parseInt(userArray[i]) <= upperbound)) {
                System.out.print(userArray[i] + " ");
            }
        }
        System.out.println();


    }
}
