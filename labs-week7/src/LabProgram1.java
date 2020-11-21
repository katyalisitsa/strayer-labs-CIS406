import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram1 {

    /* Define your method here */
    public static void SwapValues(int[] values){
        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;
    }



    public static void main(String[] args) {
        /* Type your code here. */
        String userInput;
        String[] userInputArray;

        List<Integer> intArray = new ArrayList<Integer>();

        Scanner scnr = new Scanner(System.in);

        userInput = scnr.nextLine();
        userInputArray = userInput.split(" ");

        intArray.add(0, Integer.valueOf(userInputArray[0]));
        intArray.add(1, Integer.valueOf(userInputArray[1]));

        System.out.println(userInput);




    }
}
