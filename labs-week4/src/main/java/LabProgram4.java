import java.util.Scanner;

public class LabProgram4 {

    /*
     * Write a program whose input is a character and a string,
     * and whose output indicates the number of times the character appears in the string.
     * Ex: If the input is: n Monday, the output is: 1
     * Ex: If the input is: z Today is Monday, the output is: 0
     * Ex: If the input is: n It's a sunny day, the output is: 2
     * Case matters.
     * Ex: If the input is: n Nobody, the output is: 0
     * n is different than N.
     */

    public static void main(String[] args) {
        char inputChar;
        String inputString;
        String[] inputStringArray;
        int num;

        num = 0;

        Scanner scnr = new Scanner(System.in);

        inputString = scnr.nextLine();
        inputStringArray = inputString.split(" ");

        inputChar = inputStringArray[0].charAt(0);
        inputString = inputString.substring(2);

        for (int i = 0; i < inputString.length(); i++) {
            if ((Character.valueOf(inputString.charAt(i))).equals(inputChar)) {

                num = num + 1;
            }


        }

        System.out.println(num);


    }
}