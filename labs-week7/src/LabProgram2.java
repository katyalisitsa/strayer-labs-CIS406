import java.lang.reflect.Array;
import java.util.Scanner;

public class LabProgram2 {

    /* Define your method here */
    public static int CountCharacters(char userChar, String userString){
        int countChars=0;
        char[] userCharArray = new char[userString.length()];
        for(int i=0; i<userString.length();i++){
            userCharArray[i]=userString.charAt(i);
        }
        for(int i=0;i<userString.length();i++){
            if(userChar == userCharArray[i]){
                countChars = countChars + 1;
            }
        }
        return countChars;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        String userInput;
        String[] userInputArray;
        char userChar;
        String userString;


        Scanner scnr = new Scanner(System.in);
        userInput = scnr.nextLine();

        userInputArray = userInput.split(" ");
        userChar = userInputArray[0].charAt(0);
        userString = userInputArray[1];

        System.out.println(CountCharacters(userChar,userString));



    }
}
