import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram3 {

    /*
     * When analyzing data sets, such as data for human heights or for human weights,
     * a common step is to adjust the data. This can be done by normalizing to values
     * between 0 and 1, or throwing away outliers. For this program, adjust the values
     * by subtracting the smallest value from all the values. The input begins with an
     * integer indicating the number of integers that follow. Assume that the list will
     * always contain less than 20 integers.
     * Ex: If the input is 5 30 50 10 70 65, the output is:
     * 20 40 0 60 55
     */

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int numElements;
        int smallest;

        numElements = scnr.nextInt(); // Input begins with number of integers that follow

        int[] userList = new int[numElements];


        for (int i = 0; i < numElements; i++) {

            userList[i] = scnr.nextInt();

        }

        smallest = userList[0];

        for (int k = 0; k < numElements; k++) {

            if (userList[k] < smallest) {
                smallest = userList[k];

            }
        }

        for (int l = 0; l < numElements; l++) {
            userList[l] = userList[l] - smallest;
            System.out.print(userList[l] + " ");
        }
        System.out.println();
    }

}

