import java.util.Scanner;

public class LabProgram5 {
    public static void main(String[] args) {
        /* Type your code here. */

        String userInput;
        String[] userInputArray;
        int firstInt;
        int secondInt;

        Scanner scnr = new Scanner(System.in);
        userInput = scnr.nextLine();

        userInputArray = userInput.split(" ");
        firstInt = Integer.parseInt(userInputArray[0]);
        secondInt = Integer.parseInt(userInputArray[1]);

        if(firstInt <= secondInt){
        while(firstInt <= secondInt){
            System.out.print(firstInt + " ");
            firstInt = firstInt + 10;
        }
        System.out.println();}else{
            System.out.println("Second integer can't be less than the first.");
        }



    }
}
