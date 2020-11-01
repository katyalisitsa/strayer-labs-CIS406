import java.util.Scanner;

public class LabProgram2 {

    /*
     * Many documents use a specific format for a person's name.
     * Write a program whose input is: firstName middleName lastName, and whose output is:
     * lastName, firstName middleInitial.
     * Ex: If the input is Pat Silly Doe, the output is:
     * Doe, Pat S.
     * If the input has the form firstName lastName, the output is lastName, firstName.
     * Ex: If the input is: Julia Clark, the output is:
     * Clark, Julia
     * */


    public static void main(String[] args) {
        /* Type your code here. */
        String[] inputStringArray;
        String inputString;
        String[] middleName;

        Scanner scnr = new Scanner(System.in);

        inputString = scnr.nextLine();
        inputStringArray = inputString.split(" ");

        if (inputStringArray.length == 2) {
            System.out.println(inputStringArray[1] + ", " + inputStringArray[0]);
        } else if (inputStringArray.length == 3) {
            middleName = inputStringArray[1].split("");
            System.out.println(inputStringArray[2] + ", " + inputStringArray[0] + " " + middleName[0] + ".");
        }
    }
}