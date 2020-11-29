
import java.util.Scanner;

public class LabProgram {

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
