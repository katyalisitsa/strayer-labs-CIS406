import java.util.Scanner;

public class LabProgram1 {

    /*
     * Write a program that takes a date as input and outputs the date's season.
     * The input is a string to represent the month and an int to represent the day.
     * Ex: If the input is April 11, the output is: spring
     * In addition, check if the string and int are valid (an actual month and day).
     * Ex: If the input is invalid, the output is: invalid
     * The dates for each season are:
     *    spring: March 20 - June 20
     *    summer: June 21 - September 21
     *    autumn: September 22 - December 20
     *    winter: December 21 - March 19
     */

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;
        String inputString;

        /*inputString = scnr.nextLine();
         * inputStringArray = inputString.split(" ");
         * inputMonth = inputStringArray[0];
         * inputDay = [1].toInt;
         * inputMonth = scnr.nextLine();
         * inputDay = Integer.valueOf(scnr.nextLine());
         */


        String[] inputStringArray;

        //while (scnr.hasNextInt() && scnr.hasNextLine()){
        //inputMonth = scnr.nextLine();
        //inputDay = Integer.valueOf(scnr.nextLine());

        inputString = scnr.nextLine();
        inputStringArray = inputString.split(" ");
        inputMonth = inputStringArray[0];
        inputDay = Integer.parseInt(inputStringArray[1]);

        if ((inputMonth.equals("January") || inputMonth.equals("February") || inputMonth.equals("March") || inputMonth.equals("April") ||
                inputMonth.equals("May") || inputMonth.equals("June") || inputMonth.equals("July") || inputMonth.equals("August")
                || inputMonth.equals("September") || inputMonth.equals("October") || inputMonth.equals("November")
                || inputMonth.equals("December")) && (inputDay > 0 && inputDay <= 31)) {
            if ((inputMonth.equals("March") && inputDay >= 20) || (inputMonth.equals("April")) || (inputMonth.equals("May") && inputDay <= 20)) {
                System.out.println("spring");
            } else if ((inputMonth.equals("June") && inputDay >= 21) || (inputMonth.equals("July")) || (inputMonth.equals("August")) || (inputMonth.equals("September") && inputDay <= 21)) {
                System.out.println("summer");
            } else if ((inputMonth.equals("September") && inputDay >= 22) || (inputMonth.equals("October")) || (inputMonth.equals("November")) || (inputMonth.equals("December") && inputDay <= 20)) {
                System.out.println("autumn");
            } else {
                System.out.println("winter");
            }


        } else {
            System.out.println("invalid");


        }
    }
}